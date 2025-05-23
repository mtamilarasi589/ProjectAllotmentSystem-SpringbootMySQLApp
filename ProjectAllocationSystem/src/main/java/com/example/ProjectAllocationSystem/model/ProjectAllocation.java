package com.example.ProjectAllocationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProjectAllocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // No need to provide value

    private String name;
    private String emailId;
    private String projectName;

    public ProjectAllocation() {
    }

    public ProjectAllocation(String name, String emailId, String projectName) {
       this.name = name;
        this.emailId = emailId;
        this.projectName = projectName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}
