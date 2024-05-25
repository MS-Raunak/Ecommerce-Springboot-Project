package com.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
