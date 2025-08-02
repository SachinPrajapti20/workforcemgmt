package com.sachin.workforcemgmt.workforcemgmt.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class WorkerRequest {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private String name;

    public WorkerRequest(String name, String role, LocalDate dateOfBirth) {
        this.name = name;
        this.role = role;
        this.dateOfBirth = dateOfBirth;
    }
    public WorkerRequest(){
        super();
    }

    private String role;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

}
