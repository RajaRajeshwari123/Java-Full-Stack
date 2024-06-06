package com.prodapt.cmsprojectmain.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.dao.EmptyResultDataAccessException;

import com.prodapt.cmsprojectmain.entities.Features;
import com.prodapt.cmsprojectmain.entities.Parameter;
import com.prodapt.cmsprojectmain.exceptions.FeatureNotFoundException;
import com.prodapt.cmsprojectmain.repositories.FeatureRepository;

class FeatureServiceImplTest {

	private FeatureServiceImpl featureService;
	private FeatureRepository featureRepository;

	@BeforeEach
	void setUp() {
		featureRepository = mock(FeatureRepository.class);
		featureService = new FeatureServiceImpl();
		featureService.setRepo(featureRepository);
	}

	@Test
	void testCreateFeature() {
		Features feature = new Features();
		when(featureRepository.save(feature)).thenReturn(feature);
		Features createdFeature = featureService.createFeature(feature);
		assertEquals(feature, createdFeature);
	}

	@Test
	void testDeleteFeatureByIdSuccess() throws FeatureNotFoundException {
		long featureId = 1L;
		Optional<Features> featureOptional = Optional.of(new Features());
		when(featureRepository.findById(featureId)).thenReturn(featureOptional);
		String result = featureService.deleteFeatureById(featureId);
		assertEquals("Feature deleted sucessfully", result);
		verify(featureRepository).deleteById(featureId);
	}

	@Test
	void testDeleteFeatureByIdFeatureNotFound() {
		long featureId = 1L;
		Optional<Features> featureOptional = Optional.empty();
		when(featureRepository.findById(featureId)).thenReturn(featureOptional);
		assertThrows(FeatureNotFoundException.class, () -> featureService.deleteFeatureById(featureId));
	}

	@Test
	void testDeleteFeatureByIdError() {
		long featureId = 1L;
		Optional<Features> featureOptional = Optional.empty();
		when(featureRepository.findById(featureId)).thenReturn(featureOptional);
		assertThrows(FeatureNotFoundException.class, () -> featureService.deleteFeatureById(featureId));
	}

	@AfterEach
	void tearDown() {
		featureService = null;
	}
}
