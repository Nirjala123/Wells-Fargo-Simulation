package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer permissionID;

    @Column(nullable = false, unique = true, length = 50)
    private String permissionName;

    public Permission(Integer permissionID, String permissionName) {
      this.permissionID = permissionID;
      this.permissionName = permissionName;
    }

    public Integer getPermissionID() {
      return permissionID;
    }

  

    public String getPermissionName() {
      return permissionName;
    }

    public void setPermissionName(String permissionName) {
      this.permissionName = permissionName;
    }

    
}
