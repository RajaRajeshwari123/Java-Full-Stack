package com.prodapt.cmsprojectmain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.cmsprojectmain.entities.Quotation;
import com.prodapt.cmsprojectmain.exceptions.QuotationNotFoundException;
import com.prodapt.cmsprojectmain.repositories.QuotationRepository;
import com.prodapt.cmsprojectmain.utility.QUERYMAPPER;

@Service
public class QuotationServiceImpl implements QuotationService {

	private static final Logger loggers = LoggerFactory.getLogger(QuotationServiceImpl.class);
    @Autowired
    private QuotationRepository quotationRepository;

    @Override
    public Quotation addQuotation(Quotation quotation) {
        return quotationRepository.save(quotation);
    }

    @Override
    public Quotation getQuotationById(Long id) throws QuotationNotFoundException {
        return quotationRepository.findById(id).orElseThrow(() -> new QuotationNotFoundException("Quotation not found"));
    }

    @Override
	 public List<Quotation> getAllQuotations() {
   
		List<Quotation> quotations= new ArrayList<>();
		quotationRepository.findAll().forEach(quotations::add);
		return quotations;
	}
    @Override
	public String deleteQuotionbyid(Long id) throws QuotationNotFoundException {
		Optional<Quotation> deletequotation = quotationRepository.findById(id);
		if (deletequotation.isPresent()) {
			quotationRepository.deleteById(id);
			return QUERYMAPPER.RECORD_DELETED_SUCCESSFULLY;
 
		} else {
			
			throw new QuotationNotFoundException();
		}
	}

}
