package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AdvisorRole")
@IdClass(AdvisorRoleId.class) // Composite key class
public class AdvisorRole {
    @Id
    @ManyToOne
    @JoinColumn(name = "AdvisorID")
    private FinancialAdvisor financialAdvisor;

    @Id
    @ManyToOne
    @JoinColumn(name = "RoleID")
    private Role role;

    public AdvisorRole(FinancialAdvisor financialAdvisor, Role role) {
        this.financialAdvisor = financialAdvisor;
        this.role = role;
      }

    public FinancialAdvisor getFinancialAdvisor() {
      return financialAdvisor;
    }

    public Role getRole() {
      return role;
    }

    

    

    

}

