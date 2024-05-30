package com.prodapt.cmsprojectdemo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.cmsprojectdemo.entities.User;



@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	public Optional<User> findByUsername(String username);

	public Boolean existsByUsername(String username);

	public Boolean existsByEmail(String email);
}
