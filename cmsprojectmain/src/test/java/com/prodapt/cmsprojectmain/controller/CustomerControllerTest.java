package com.prodapt.cmsprojectmain.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.prodapt.cmsprojectmain.entities.Product;
import com.prodapt.cmsprojectmain.exceptions.ProductNotFoundException;
import com.prodapt.cmsprojectmain.service.ProductService;

class CustomerControllerTest {

    private ProductService productService;
    private CustomerController customerController;

    @BeforeEach
    void setUp() {
        productService = mock(ProductService.class);
        customerController = new CustomerController();
        customerController.setProductService(productService);
    }

    @Test
    void testGetProductByName() throws ProductNotFoundException {
        String productName = "TestProduct";
        Product product = new Product();
        product.setName(productName);
        when(productService.getProductByName(productName)).thenReturn(product);

        ResponseEntity<Product> responseEntity = customerController.getProductByName(productName);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(product, responseEntity.getBody());
    }

    @Test
    void testGetAllProducts() {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product();
        Product product2 = new Product();
        productList.add(product1);
        productList.add(product2);
        when(productService.getAllProducts()).thenReturn(productList);

        ResponseEntity<List<Product>> responseEntity = customerController.getAllProducts();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(productList, responseEntity.getBody());
    }
}
