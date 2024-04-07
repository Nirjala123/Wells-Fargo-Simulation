package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientID;

    @ManyToOne
    @JoinColumn(name = "AdvisorID", nullable = false)
    private FinancialAdvisor financialAdvisor;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(length = 255)
    private String contactInfo;

    @Column(length = 255)
    private String address;


    public Client(Integer clientID, FinancialAdvisor financialAdvisor, String name, String contactInfo,
        String address) {
      this.clientID = clientID;
      this.financialAdvisor = financialAdvisor;
      this.name = name;
      this.contactInfo = contactInfo;
      this.address = address;
    }

    public Integer getClientID() {
      return clientID;
    }


    public FinancialAdvisor getFinancialAdvisor() {
      return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
      this.financialAdvisor = financialAdvisor;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getContactInfo() {
      return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
      this.contactInfo = contactInfo;
    }

    public String getAddress() {
      return address;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    // Getters and setters
    
}
