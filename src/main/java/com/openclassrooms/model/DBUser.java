package com.openclassrooms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DBUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String role;



    // Getters and setters …

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }
}