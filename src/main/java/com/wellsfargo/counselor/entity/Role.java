package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleID;

    @Column(nullable = false, unique = true, length = 50)
    private String roleName;

    public Role(Integer roleID, String roleName) {
      this.roleID = roleID;
      this.roleName = roleName;
    }

    public Integer getRoleID() {
      return roleID;
    }


    public String getRoleName() {
      return roleName;
    }

    public void setRoleName(String roleName) {
      this.roleName = roleName;
    }

    
}
