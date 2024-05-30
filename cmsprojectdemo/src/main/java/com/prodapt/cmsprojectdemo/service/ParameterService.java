package com.prodapt.cmsprojectdemo.service;

import com.prodapt.cmsprojectdemo.entities.Parameter;
import com.prodapt.cmsprojectdemo.exceptions.ParameterNotFoundException;

public interface ParameterService {
	 public Parameter createParameter(Parameter parameter);
	 public Parameter deleteParameterById(Long parameterId)throws ParameterNotFoundException;
	

}
