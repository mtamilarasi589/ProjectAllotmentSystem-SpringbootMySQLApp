package com.example.ProjectAllocationSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectAllocationSystem.model.Project;
import com.example.ProjectAllocationSystem.model.ProjectAllocation;
import com.example.ProjectAllocationSystem.repository.ProjectAllocationRepo;
import com.example.ProjectAllocationSystem.repository.ProjectRepo;

@Service
public class ProjectService {
    @Autowired
    ProjectRepo projectRepo;

    @Autowired
    ProjectAllocationRepo projectAllocRepo;

    public List<Project> availableProjects() {
        return projectRepo.findAll();
    }

    public List<ProjectAllocation> assignedMembers() {
        return projectAllocRepo.findAll();
    }

    public void assignProject(String name, String emailId, String projectName) {
        ProjectAllocation projectAssigned = new ProjectAllocation(name, emailId, projectName);
        projectAllocRepo.save(projectAssigned);
    }

}
