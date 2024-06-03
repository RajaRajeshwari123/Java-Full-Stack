package com.prodapt.cmsprojectmain.service;

import java.util.Optional;

import com.prodapt.cmsprojectmain.entities.ERole;
import com.prodapt.cmsprojectmain.entities.Role;
import com.prodapt.cmsprojectmain.entities.User;
import com.prodapt.cmsprojectmain.exceptions.UserNotFoundException;

public interface UserService {

	public User addUserEntity(User user);

	public String updateRole(Integer userId, Role role)throws UserNotFoundException;

	public Optional<User> findByUsername(String username);

	public Boolean existsByUsername(String username);

	public Optional<User> findByRole(ERole role);
	
	    User getUserById(Integer id) throws UserNotFoundException; 
	    
}