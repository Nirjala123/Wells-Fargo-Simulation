package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RolePermission")
@IdClass(RolePermissionId.class) // Composite key class
public class RolePermission {
    @Id
    @ManyToOne
    @JoinColumn(name = "RoleID")
    private Role role;

    @Id
    @ManyToOne
    @JoinColumn(name = "PermissionID")
    private Permission permission;

    public RolePermission(Role role, Permission permission) {
      this.role = role;
      this.permission = permission;
    }

    public Role getRole() {
      return role;
    }

    public Permission getPermission() {
      return permission;
    }

    
}