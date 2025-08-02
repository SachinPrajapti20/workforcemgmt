package com.sachin.workforcemgmt.workforcemgmt.dto;

import java.time.LocalDate;

public class WorkerResponse {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private Long id;
    private String name;

    public WorkerResponse(String name, Long id, LocalDate dateOfBirth, String role) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.role = role;
    }

    public WorkerResponse() {
        super();
    }

    private String role;
    private LocalDate dateOfBirth;

}
