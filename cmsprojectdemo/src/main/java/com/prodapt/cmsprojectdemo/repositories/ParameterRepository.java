package com.prodapt.cmsprojectdemo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.prodapt.cmsprojectdemo.entities.Parameter;

public interface ParameterRepository extends JpaRepository<Parameter, Long> {
    // You can add custom query methods if needed
	public Optional<Parameter>findById(Long featureId);
}