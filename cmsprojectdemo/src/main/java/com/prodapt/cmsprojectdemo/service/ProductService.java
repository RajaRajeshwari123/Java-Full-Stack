package com.prodapt.cmsprojectdemo.service;

import java.util.List;

import com.prodapt.cmsprojectdemo.entities.Product;
import com.prodapt.cmsprojectdemo.exceptions.NoRecordFoundException;
import com.prodapt.cmsprojectdemo.exceptions.ProductNotFoundException;

public interface ProductService {
	public Product createProduct(Product product);

	public Product getProductById(Long productId) throws ProductNotFoundException;
	
	public Product getProductByName(String name) throws  ProductNotFoundException;
	// Retrieve All
		public List<Product> getAllProducts() throws NoRecordFoundException;

	public Product updateProduct(Product product) throws ProductNotFoundException;

	public Product deleteProductById(Long productId) throws ProductNotFoundException;

}
