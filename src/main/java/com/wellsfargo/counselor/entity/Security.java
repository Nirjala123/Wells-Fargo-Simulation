package com.wellsfargo.counselor.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Security")
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer securityID;

    @ManyToOne
    @JoinColumn(name = "PortfolioID", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 50)
    private String category;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private Integer quantity;

    public Security(Integer securityID, Portfolio portfolio, String name, String category, Date purchaseDate,
        BigDecimal purchasePrice, Integer quantity) {
      this.securityID = securityID;
      this.portfolio = portfolio;
      this.name = name;
      this.category = category;
      this.purchaseDate = purchaseDate;
      this.purchasePrice = purchasePrice;
      this.quantity = quantity;
    }

    public Integer getSecurityID() {
      return securityID;
    }

    public Portfolio getPortfolio() {
      return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
      this.portfolio = portfolio;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getCategory() {
      return category;
    }

    public void setCategory(String category) {
      this.category = category;
    }

    public Date getPurchaseDate() {
      return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
      this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchasePrice() {
      return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
      this.purchasePrice = purchasePrice;
    }

    public Integer getQuantity() {
      return quantity;
    }

    public void setQuantity(Integer quantity) {
      this.quantity = quantity;
    }

    
    // Getters and setters

    
}

