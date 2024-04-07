package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FinancialAdvisor")
public class FinancialAdvisor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer advisorID;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false, unique = true, length = 20)
    private String phoneNumber;

    

    public FinancialAdvisor(Integer advisorID, String name, String email, String phoneNumber) {
      this.advisorID = advisorID;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
    }

    public Integer getAdvisorID() {
      return advisorID;
    }
    

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public String getPhoneNumber() {
      return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

    

}

