package com.wellsfargo.counselor.entity;

import java.io.Serializable;

public class AdvisorRoleId implements Serializable {
    private Integer financialAdvisor;
    private Integer role;
    
    public AdvisorRoleId(Integer financialAdvisor, Integer role) {
      this.financialAdvisor = financialAdvisor;
      this.role = role;
    }

    public Integer getFinancialAdvisor() {
      return financialAdvisor;
    }

    public void setFinancialAdvisor(Integer financialAdvisor) {
      this.financialAdvisor = financialAdvisor;
    }

    public Integer getRole() {
      return role;
    }

    public void setRole(Integer role) {
      this.role = role;
    }
    
}