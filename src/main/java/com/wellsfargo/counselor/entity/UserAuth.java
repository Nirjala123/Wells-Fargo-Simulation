package com.wellsfargo.counselor.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserAuth")
public class UserAuth {
    @Id
    @OneToOne
    @JoinColumn(name = "UserID", nullable = false)
    private FinancialAdvisor financialAdvisor;

    @Column(nullable = false, unique = true, length = 255)
    private String username;

    @Column(nullable = false, length = 64)
    private String passwordHash;

    @Column
    private LocalDateTime lastLogin;

    public UserAuth(FinancialAdvisor financialAdvisor, String username, String passwordHash, LocalDateTime lastLogin) {
      this.financialAdvisor = financialAdvisor;
      this.username = username;
      this.passwordHash = passwordHash;
      this.lastLogin = lastLogin;
    }

    public FinancialAdvisor getFinancialAdvisor() {
      return financialAdvisor;
    }

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getPasswordHash() {
      return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
      this.passwordHash = passwordHash;
    }

    public LocalDateTime getLastLogin() {
      return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
      this.lastLogin = lastLogin;
    }

    // Getters and setters

    
}

