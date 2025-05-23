package com.example.ProjectAllocationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectAllocationSystem.model.ProjectAllocation;

public interface ProjectAllocationRepo extends JpaRepository<ProjectAllocation, Integer> {

}
