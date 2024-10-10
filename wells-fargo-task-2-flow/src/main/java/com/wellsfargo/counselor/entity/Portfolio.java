package com.wellsfargo.counselor.entity;


import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioID;

    @Id
    @ForeignKey(name = "clientID")
    @Column(nullable = false)
    private long clientID;


    protected Portfolio() {

    }

    public Portfolio(Client client) {
    	this.clientID = client.getClientID();
    	
    }
    
    public void setPortfolioID(long newID) {
    	this.portfolioID = newID;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }
    
    public void setClientID(long newID) {
    	this.clientID = newID;
    }

    public Long getClientID() {
        return clientID;
    }
}

    