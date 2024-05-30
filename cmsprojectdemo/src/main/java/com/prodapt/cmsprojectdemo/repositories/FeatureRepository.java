package com.prodapt.cmsprojectdemo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.prodapt.cmsprojectdemo.entities.Features;

public interface FeatureRepository extends CrudRepository<Features, Long> {
			public Optional<Features> findById(Long Id);

}
