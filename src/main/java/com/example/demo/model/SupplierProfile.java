package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class SupplierProfile{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String supplierCode;
    private String supplierName;
    private String email;
    private String phone;
    private Boolean active;
    private LocalDateTime createdAt;
    

    public Log getId(){
        return id;
    }
    public void setId
}