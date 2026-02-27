package com.task3.task3.dataAccess.abstracts;

import com.task3.task3.entities.concretes.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}