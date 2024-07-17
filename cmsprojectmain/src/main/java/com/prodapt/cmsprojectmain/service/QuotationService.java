package com.prodapt.cmsprojectmain.service;

import java.util.List;

import com.prodapt.cmsprojectmain.entities.Product;
import com.prodapt.cmsprojectmain.entities.Quotation;
import com.prodapt.cmsprojectmain.exceptions.QuotationNotFoundException;

public interface QuotationService {
    Quotation addQuotation(Quotation quotation);
    Quotation getQuotationById(Long id) throws QuotationNotFoundException;
    // Other service methods
    public List<Quotation> getAllQuotations();
    public String deleteQuotionbyid(Long id) throws QuotationNotFoundException;
    Quotation updateQuotation(Quotation quotation);
}