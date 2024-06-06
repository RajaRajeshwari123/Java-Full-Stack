package com.prodapt.cmsprojectmain.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.prodapt.cmsprojectmain.entities.Quotation;
import com.prodapt.cmsprojectmain.exceptions.QuotationNotFoundException;
import com.prodapt.cmsprojectmain.repositories.QuotationRepository;

public class QuotationServiceImplTest {

    private QuotationServiceImpl quotationService;
    private QuotationRepository quotationRepository;

    @BeforeEach
    void setUp() {
        quotationRepository = mock(QuotationRepository.class);
        quotationService = new QuotationServiceImpl();
        quotationService.setQuotationRepository(quotationRepository);
    }

    @Test
    void testAddQuotation() {
        Quotation quotation = new Quotation();
        when(quotationRepository.save(quotation)).thenReturn(quotation);
        Quotation addedQuotation = quotationService.addQuotation(quotation);
        assertEquals(quotation, addedQuotation);
    }

    @Test
    void testGetQuotationByIdSuccess() throws QuotationNotFoundException {
        long quotationId = 1L;
        Quotation quotation = new Quotation();
        quotation.setId(quotationId);
        Optional<Quotation> quotationOptional = Optional.of(quotation);
        when(quotationRepository.findById(quotationId)).thenReturn(quotationOptional);
        Quotation retrievedQuotation = quotationService.getQuotationById(quotationId);
        assertEquals(quotationId, retrievedQuotation.getId());
    }

    @Test
    void testGetQuotationByIdNotFound() {
        long quotationId = 1L;
        Optional<Quotation> quotationOptional = Optional.empty();
        when(quotationRepository.findById(quotationId)).thenReturn(quotationOptional);
        assertThrows(QuotationNotFoundException.class, () -> quotationService.getQuotationById(quotationId));
    }
}

