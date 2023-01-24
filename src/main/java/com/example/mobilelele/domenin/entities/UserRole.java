package com.example.mobilelele.domenin.entities;
import com.example.mobilelele.domenin.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_roles")
public class UserRole extends BaseEntity{

    @Enumerated(value = EnumType.STRING)
    private Role role;

    public UserRole() {
    }

    public Role getRole() {
        return role;
    }

    public UserRole setRole(Role role) {
        this.role = role;
        return this;
    }
}
