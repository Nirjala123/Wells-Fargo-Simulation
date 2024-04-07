package com.wellsfargo.counselor.entity;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Portfolio")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer portfolioID;

    @ManyToOne
    @JoinColumn(name = "ClientID", nullable = false)
    private Client client;

    @Column
    private Date creationDate;

    @Column(precision = 10, scale = 2)
    private BigDecimal totalValue;

    @Column(length = 50)
    private String riskProfile;

    public Portfolio(Integer portfolioID, Client client, Date creationDate, BigDecimal totalValue, String riskProfile) {
      this.portfolioID = portfolioID;
      this.client = client;
      this.creationDate = creationDate;
      this.totalValue = totalValue;
      this.riskProfile = riskProfile;
    }

    public Integer getPortfolioID() {
      return portfolioID;
    }


    public Client getClient() {
      return client;
    }

    public void setClient(Client client) {
      this.client = client;
    }

    public Date getCreationDate() {
      return creationDate;
    }

    public void setCreationDate(Date creationDate) {
      this.creationDate = creationDate;
    }

    public BigDecimal getTotalValue() {
      return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
      this.totalValue = totalValue;
    }

    public String getRiskProfile() {
      return riskProfile;
    }

    public void setRiskProfile(String riskProfile) {
      this.riskProfile = riskProfile;
    }

    // Getters and setters
    

}

