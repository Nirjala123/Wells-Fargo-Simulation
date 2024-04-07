package com.wellsfargo.counselor.entity;

import java.io.Serializable;

public class RolePermissionId implements Serializable {
    private Integer role;
    private Integer permission;
    public RolePermissionId(Integer role, Integer permission) {
      this.role = role;
      this.permission = permission;
    }
    public Integer getRole() {
      return role;
    }
    public void setRole(Integer role) {
      this.role = role;
    }
    public Integer getPermission() {
      return permission;
    }
    public void setPermission(Integer permission) {
      this.permission = permission;
    }
    

}