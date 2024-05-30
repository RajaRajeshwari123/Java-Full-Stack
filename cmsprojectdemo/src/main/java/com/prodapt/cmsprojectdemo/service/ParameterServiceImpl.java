package com.prodapt.cmsprojectdemo.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prodapt.cmsprojectdemo.entities.Parameter;
import com.prodapt.cmsprojectdemo.exceptions.ParameterNotFoundException;
import com.prodapt.cmsprojectdemo.repositories.ParameterRepository;
@Service
@Transactional
public class ParameterServiceImpl implements ParameterService {

	private static final Logger logger=LoggerFactory.getLogger(ParameterServiceImpl.class);
	@Autowired
    private ParameterRepository repo;

    @Override
    public Parameter createParameter(Parameter parameter) {
        return repo.save(parameter);
    }
//    }
    @Override
    public Parameter deleteParameterById(Long parameterId) throws ParameterNotFoundException{
		Optional<Parameter>deleteparameter=repo.findById(parameterId);
		if(deleteparameter.isPresent()) {
			repo.deleteById(parameterId);
			logger.info("Parameter "+parameterId+" exists in record");
			
		}else {
			logger.info("Parameter "+parameterId+" exists in record");
			throw new ParameterNotFoundException();
		}
		return null;
	}

//	@Override
//	public Parameter deleteParameterById(Long parameterId) throws ParameterNotFoundException{
//		// TODO Auto-generated method stub
//		return null;
//	}
}

