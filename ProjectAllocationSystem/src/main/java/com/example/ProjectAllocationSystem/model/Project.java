package com.example.ProjectAllocationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {
    @Id
    private String projectId;
    private String projectName;
    private String manager;
    private int durationInMonths;

    public Project() {
    }

    public Project(String projectId, String projectName, String manager, int durationInMonths) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.manager = manager;
        this.durationInMonths = durationInMonths;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

}
