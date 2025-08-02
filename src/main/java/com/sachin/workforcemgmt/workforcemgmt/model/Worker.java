package com.sachin.workforcemgmt.workforcemgmt.model;

import java.time.LocalDate;

public class Worker {
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String name;

    public Worker(Long id, String name, String role, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.dateOfBirth = dateOfBirth;
    }
    public Worker(){
        super();
    }

    private String role;
    private LocalDate dateOfBirth;


}
