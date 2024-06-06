package com.prodapt.cmsprojectmain.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach; // Correct import for setup method
import org.junit.jupiter.api.Test;

import com.prodapt.cmsprojectmain.entities.Parameter;
import com.prodapt.cmsprojectmain.entities.Product;
import com.prodapt.cmsprojectmain.exceptions.ParameterNotFoundException;
import com.prodapt.cmsprojectmain.exceptions.ProductNotFoundException;
import com.prodapt.cmsprojectmain.repositories.ParameterRepository;
import com.prodapt.cmsprojectmain.repositories.ProductRepository;

class ParameterServiceImplTest {

	private ParameterServiceImpl parameterService;

	private ParameterRepository parameterRepository;

	@BeforeEach
	void setUp() {
		parameterRepository = mock(ParameterRepository.class);
		parameterService = new ParameterServiceImpl();
		parameterService.setRepo(parameterRepository);
	}

	@Test
	void testCreateParameter() {
		Parameter parameter = new Parameter();
		when(parameterRepository.save(parameter)).thenReturn(parameter);
		assertEquals(parameter, parameterService.createParameter(parameter));
	}

	@Test
	void testDeleteParameterById_Success() throws ParameterNotFoundException {
		Long parameterId = 1L;
		Optional<Parameter> parameterOptional = Optional.of(new Parameter());
		when(parameterRepository.findById(parameterId)).thenReturn(parameterOptional);
		String result = parameterService.deleteParameterById(parameterId);
		assertEquals("Parameter deleted sucessfully", result);
		verify(parameterRepository).deleteById(parameterId);
	}
	
	@Test
	void testDeleteParameterById_ParameterNotFound() {
		Long parameterId = 1L;
		Optional<Parameter> parameterOptional = Optional.empty();
		when(parameterRepository.findById(parameterId)).thenReturn(parameterOptional);

		assertThrows(ParameterNotFoundException.class, () -> parameterService.deleteParameterById(parameterId));
	}
}
