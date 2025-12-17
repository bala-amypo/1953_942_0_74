package com.example.demo.model;


@Entity
public class SupplierProfile{

    @Id
    private Long id;
    
    private String supplierCode;
    private String supplierName;
    private String email;
    private String phone;
    private Boolean active;
    private LocalDateTime createdAt;
    
}