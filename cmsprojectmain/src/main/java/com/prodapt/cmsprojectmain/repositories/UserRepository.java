package com.prodapt.cmsprojectmain.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.prodapt.cmsprojectmain.entities.ERole;
import com.prodapt.cmsprojectmain.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	public Optional<User> findByUsername(String username);

	public Boolean existsByUsername(String username);

	public Boolean existsByEmail(String email);
	
	public Optional<User> findByRole(ERole role);
}
