package com.prodapt.cmsprojectdemo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.cmsprojectdemo.entities.ERole;
import com.prodapt.cmsprojectdemo.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
  Optional<Role> findByName(ERole name);
}