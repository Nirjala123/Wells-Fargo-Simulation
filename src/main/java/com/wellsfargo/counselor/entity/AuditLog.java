package com.wellsfargo.counselor.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AuditLog")
public class AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer logID;

    @ManyToOne
    @JoinColumn(name = "UserID", nullable = false)
    private FinancialAdvisor financialAdvisor;

    @Column(nullable = false, length = 50)
    private String actionType;

    @Column(length = 512)
    private String description;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    public AuditLog(Integer logID, FinancialAdvisor financialAdvisor, String actionType, String description,
        LocalDateTime timestamp) {
      this.logID = logID;
      this.financialAdvisor = financialAdvisor;
      this.actionType = actionType;
      this.description = description;
      this.timestamp = timestamp;
    }

    // Getters and setters
    public Integer getLogID() {
      return logID;
    }


    public FinancialAdvisor getFinancialAdvisor() {
      return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
      this.financialAdvisor = financialAdvisor;
    }

    public String getActionType() {
      return actionType;
    }

    public void setActionType(String actionType) {
      this.actionType = actionType;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public LocalDateTime getTimestamp() {
      return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
      this.timestamp = timestamp;
    }

}
