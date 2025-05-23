package com.example.ProjectAllocationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectAllocationSystem.model.Project;
import com.example.ProjectAllocationSystem.model.ProjectAllocation;
import com.example.ProjectAllocationSystem.service.ProjectService;

@RestController
// @CrossOrigin(origins = "http://localhost:8080")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> availableDetails() {
        return projectService.availableProjects();
    }

    @GetMapping("/projects/assigned")
    public List<ProjectAllocation> assignedDetails() {
        return projectService.assignedMembers();
    }

    @PostMapping("/projects/allocation")
    public String assign(@RequestParam("name") String name,
            @RequestParam("emailId") String emailId,
            @RequestParam("projectName") String projectName) {
        projectService.assignProject(name, emailId, projectName);
        return "Project " + projectName + " is allotted for " + name;

    }

}
