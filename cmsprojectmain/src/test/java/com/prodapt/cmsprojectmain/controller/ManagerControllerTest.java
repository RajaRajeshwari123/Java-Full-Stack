package com.prodapt.cmsprojectmain.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.prodapt.cmsprojectmain.dto.QuotationDTO;
import com.prodapt.cmsprojectmain.entities.Product;
import com.prodapt.cmsprojectmain.entities.Quotation;
import com.prodapt.cmsprojectmain.entities.UserEntity;
import com.prodapt.cmsprojectmain.exceptions.ProductNotFoundException;
import com.prodapt.cmsprojectmain.exceptions.QuotationNotFoundException;
import com.prodapt.cmsprojectmain.exceptions.UserNotFoundException;
import com.prodapt.cmsprojectmain.service.ProductService;
import com.prodapt.cmsprojectmain.service.QuotationService;
import com.prodapt.cmsprojectmain.service.UserEntityService;

class ManagerControllerTest {

    private ProductService productService;
    private QuotationService quotationService;
    private UserEntityService userService;
    private ManagerController managerController;

    @BeforeEach
    void setUp() {
        productService = mock(ProductService.class);
        quotationService = mock(QuotationService.class);
        userService = mock(UserEntityService.class);
        managerController = new ManagerController();
        managerController.setProductService(productService);
        managerController.setQuotationService(quotationService);
        managerController.setModelMapper(new ModelMapper());
        managerController.setUserService(userService);
    }

    @Test
    void testGetProductByName_Success() throws ProductNotFoundException {
        String productName = "TestProduct";
        Product product = new Product();
        product.setName(productName);
        when(productService.getProductByName(productName)).thenReturn(product);

        ResponseEntity<Product> responseEntity = managerController.getProductByName(productName);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(product, responseEntity.getBody());
    }

    @Test
    void testGetProductById_Success() throws ProductNotFoundException {
        long productId = 1L;
        Product product = new Product();
        when(productService.getProductById(productId)).thenReturn(product);

        ResponseEntity<Product> responseEntity = managerController.getProductById(productId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(product, responseEntity.getBody());
    }

    @Test
    void testGetAllProducts_Success() {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product();
        Product product2 = new Product();
        productList.add(product1);
        productList.add(product2);
        when(productService.getAllProducts()).thenReturn(productList);

        ResponseEntity<List<Product>> responseEntity = managerController.getAllProducts();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(productList, responseEntity.getBody());
    }

    @Test
    void testAddQuotation_Success() throws UserNotFoundException, ProductNotFoundException {
        QuotationDTO quotationDTO = new QuotationDTO();
        quotationDTO.setUserId((int) 1L); 
        quotationDTO.setProductId(2L);
        when(userService.getUserEntityById(1)).thenReturn(new UserEntity());
        when(productService.getProductById(2L)).thenReturn(new Product());
        Quotation quotation = new Quotation();
        when(quotationService.addQuotation(any(Quotation.class))).thenReturn(quotation);
        ResponseEntity<QuotationDTO> responseEntity = managerController.addQuotation(quotationDTO);
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
    }

    @Test
    void testGetQuotationById_Success() throws QuotationNotFoundException {
        long quotationId = 1L;
        Quotation quotation = new Quotation();
        when(quotationService.getQuotationById(quotationId)).thenReturn(quotation);

        ResponseEntity<QuotationDTO> responseEntity = managerController.getQuotationById(quotationId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}
