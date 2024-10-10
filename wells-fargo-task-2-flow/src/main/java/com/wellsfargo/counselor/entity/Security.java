package com.wellsfargo.counselor.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long securityID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDateTime dateOfPurchase;

    @Column(nullable = false)
    private long quantity;

    protected Security() {

    }

    public Security(String name, String category, LocalDateTime dateOfPurchase, long quantity) {
        this.name = name;
        this.category = category;
        this.dateOfPurchase = dateOfPurchase;
        this.quantity = quantity;
    }

    public Long getSecurityID() {
        return securityID;
    }

    public String getName() {
        return name;
    }

    public void setForeName(String newName) {
        this.name = newName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDateTime newTime) {
        this.dateOfPurchase = newTime;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setEmail(long newQuantity) {
        this.quantity = newQuantity;
    }
}
