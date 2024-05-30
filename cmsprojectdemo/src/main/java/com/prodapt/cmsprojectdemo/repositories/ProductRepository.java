package com.prodapt.cmsprojectdemo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.cmsprojectdemo.entities.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	public Optional<Product> findById(Long productId);
	public Optional<Product> findByName(String name);
	
}