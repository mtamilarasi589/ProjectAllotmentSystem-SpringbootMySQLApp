package com.example.ProjectAllocationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectAllocationSystem.model.Project;

public interface ProjectRepo extends JpaRepository<Project, String> {

}
