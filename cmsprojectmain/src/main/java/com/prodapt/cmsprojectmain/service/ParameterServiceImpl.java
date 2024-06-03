package com.prodapt.cmsprojectmain.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prodapt.cmsprojectmain.entities.Parameter;
import com.prodapt.cmsprojectmain.exceptions.ParameterNotFoundException;
import com.prodapt.cmsprojectmain.repositories.ParameterRepository;

@Service
@Transactional
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    private ParameterRepository repo;
    
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public Parameter createParameter(Parameter parameter) {
        return repo.save(parameter);
    }

	@Override
	public String deleteParameterById(Long parameterId) throws ParameterNotFoundException{
		Optional<Parameter>deleteparameter=repo.findById(parameterId);
		if(deleteparameter.isPresent()) {
			repo.deleteById(parameterId);
			logger.info("Parameter "+parameterId+" exists in record");
			return "Parameter deleted sucessfully";
			
		}else {
			logger.info("Parameter "+parameterId+" exists in record");
			throw new ParameterNotFoundException();
		}
	}
		
		
		
	}


