package com.prodapt.cmsprojectdemo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.cmsprojectdemo.entities.Product;
import com.prodapt.cmsprojectdemo.exceptions.NoRecordFoundException;
import com.prodapt.cmsprojectdemo.exceptions.ProductNotFoundException;
import com.prodapt.cmsprojectdemo.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	@Autowired
	ProductRepository repo;
	
	@Override
	public Product createProduct(Product product) {
		return repo.save(product);
			}

	@Override
	public Product getProductById(Long productId) throws ProductNotFoundException {
		Optional<Product>prod=repo.findById(productId);
		if(prod.isPresent()) {
			
			logger.info("Product "+productId+" exists in record");
			return prod.get();
		}else {
			logger.info("Product "+productId+" doesn't exists");
			throw new ProductNotFoundException();
		}
		
	}

	@Override
	public Product getProductByName(String name) throws ProductNotFoundException {
		Optional<Product>prod=repo.findByName(name);
		if(prod.isPresent()) {
			logger.info("Product "+name+" exists in record");
			return prod.get();
		}else {
			logger.info("Product "+name+" exists in record");
			throw new ProductNotFoundException();
		}
	
	}

	@Override
	public Product updateProduct(Product product) throws ProductNotFoundException {
		Optional<Product>prod=repo.findById(product.getId());
		if(prod.isPresent()) {
			repo.save(product);
			logger.info("Product "+product.getId()+" exists in record");
			return null;
		}else {
			logger.info("Product "+product.getId()+" doesn't exists");
		throw new ProductNotFoundException();
	}
	}
	@Override
	public Product deleteProductById(Long productId) throws ProductNotFoundException {
		Optional<Product>prod=repo.findById(productId);
		if(prod.isPresent()) {
			repo.deleteById(productId);
			logger.info("Product "+productId+" exists in record");
			
		}else {
			logger.info("Product "+productId+" exists in record");
			throw new ProductNotFoundException();
		}
		return null;
	}

	@Override
	public List<Product> getAllProducts() throws NoRecordFoundException {
		List<Product>allproduct=(List<Product>)repo.findAll();
		if(!allproduct.isEmpty()) {
			logger.info("Products exist in records");
            return allproduct;
        } else {
            logger.info("No products found in records");
            throw new NoRecordFoundException("No Product Found");
        }
	}
	

}
