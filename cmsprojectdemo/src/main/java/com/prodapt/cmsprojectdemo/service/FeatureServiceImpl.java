package com.prodapt.cmsprojectdemo.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.cmsprojectdemo.entities.Features;
import com.prodapt.cmsprojectdemo.exceptions.FeatureNotFoundException;
import com.prodapt.cmsprojectdemo.exceptions.ProductNotFoundException;
import com.prodapt.cmsprojectdemo.repositories.FeatureRepository;
@Service
public class FeatureServiceImpl implements FeatureService {

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	@Autowired
	private FeatureRepository repo;
	@Override
	public Features createFeature(Features feature) {

		return repo.save(feature);
	}
	@Override
	public Features deleteFeatureById(Long featureId) throws FeatureNotFoundException {
	    Optional<Features> deletedFeature = repo.findById(featureId);
	    if (deletedFeature.isPresent()) {
	        repo.deleteById(featureId);
	        logger.info("Feature with ID " + featureId + " has been deleted.");
	        return deletedFeature.get();
	    } else {
	        logger.info("Feature with ID " + featureId + " does not exist in the record.");
	        throw new FeatureNotFoundException();
	    }
	}
		
	}

