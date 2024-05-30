package com.prodapt.cmsprojectdemo.service;

import com.prodapt.cmsprojectdemo.entities.Features;
//import com.prodapt.cmsprojectdemo.entities.Product;
import com.prodapt.cmsprojectdemo.exceptions.FeatureNotFoundException;
//import com.prodapt.cmsprojectdemo.exceptions.ProductNotFoundException;

public interface FeatureService {
	public Features createFeature(Features feature);
	public Features deleteFeatureById(Long featureId) throws FeatureNotFoundException;



}
