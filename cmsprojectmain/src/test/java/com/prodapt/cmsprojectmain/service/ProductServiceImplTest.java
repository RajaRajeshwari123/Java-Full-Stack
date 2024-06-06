package com.prodapt.cmsprojectmain.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.prodapt.cmsprojectmain.entities.Product;
import com.prodapt.cmsprojectmain.exceptions.ProductNotFoundException;
import com.prodapt.cmsprojectmain.repositories.ProductRepository;

class ProductServiceImplTest {

    private ProductServiceImpl productService;
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productRepository = mock(ProductRepository.class);
        productService = new ProductServiceImpl();
        productService.setRepo(productRepository);
    }

    @Test
    void testCreateProduct() {
        Product product = new Product();
        when(productRepository.save(product)).thenReturn(product);
        Product createdProduct = productService.createproduct(product);
        assertEquals(product, createdProduct);
    }

    @Test
    void testGetProductByIdSuccess() throws ProductNotFoundException {
        long productId = 1L;
        Product product = new Product();
        product.setId(productId);
        Optional<Product> productOptional = Optional.of(product);
        when(productRepository.findById(productId)).thenReturn(productOptional);
        Product retrievedProduct = productService.getProductById(productId);
        assertEquals(productId, retrievedProduct.getId());
    }

    @Test
    void testGetProductByIdNotFound() {
        long productId = 1L;
        Optional<Product> productOptional = Optional.empty();
        when(productRepository.findById(productId)).thenReturn(productOptional);
        assertThrows(ProductNotFoundException.class, () -> productService.getProductById(productId));
    }

    @Test
    void testGetProductByNameSuccess() throws ProductNotFoundException {
        String productName = "TestProduct";
        Product product = new Product();
        product.setName(productName);
        Optional<Product> productOptional = Optional.of(product);
        when(productRepository.findByName(productName)).thenReturn(productOptional);
        Product retrievedProduct = productService.getProductByName(productName);
        assertEquals(productName, retrievedProduct.getName());
    }

    @Test
    void testGetProductByNameNotFound() {
        String productName = "NonExistingProduct";
        Optional<Product> productOptional = Optional.empty();
        when(productRepository.findByName(productName)).thenReturn(productOptional);
        assertThrows(ProductNotFoundException.class, () -> productService.getProductByName(productName));
    }

    @Test
    void testGetAllProducts() {
        List<Product> productList = new ArrayList<>();
        when(productRepository.findAll()).thenReturn(productList);
        List<Product> retrievedProducts = productService.getAllProducts();
        assertEquals(productList, retrievedProducts);
    }

    @Test
    void testUpdateProductSuccess() throws ProductNotFoundException {
        long productId = 1L;
        Product existingProduct = new Product();
        existingProduct.setId(productId);
        when(productRepository.findById(productId)).thenReturn(Optional.of(existingProduct));

        Product updatedProduct = new Product();
        updatedProduct.setId(productId);
        updatedProduct.setName("UpdatedProduct");

        productService.updateProduct(productId, updatedProduct);
        verify(productRepository).save(updatedProduct);
    }

    @Test
    void testUpdateProductNotFound() {
        long productId = 1L;
        Product updatedProduct = new Product();
        updatedProduct.setId(productId);
        updatedProduct.setName("UpdatedProduct");

        when(productRepository.findById(productId)).thenReturn(Optional.empty());
        assertThrows(ProductNotFoundException.class, () -> productService.updateProduct(productId, updatedProduct));
    }

    @Test
    void testDeleteProductByIdSuccess() throws ProductNotFoundException {
        long productId = 1L;
        Optional<Product> productOptional = Optional.of(new Product());
        when(productRepository.findById(productId)).thenReturn(productOptional);
        String result = productService.deleteProductid(productId);
        assertEquals("Record deleted successfully", result);
        verify(productRepository).deleteById(productId);
    }

    @Test
    void testDeleteProductByIdProductNotFound() {
        long productId = 1L;
        Optional<Product> productOptional = Optional.empty();
        when(productRepository.findById(productId)).thenReturn(productOptional);
        assertThrows(ProductNotFoundException.class, () -> productService.deleteProductid(productId));
    }
}
