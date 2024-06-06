package com.prodapt.cmsprojectmain.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.cmsprojectmain.entities.Features;
import com.prodapt.cmsprojectmain.entities.Product;
import com.prodapt.cmsprojectmain.entities.Role;
import com.prodapt.cmsprojectmain.exceptions.FeatureNotFoundException;
import com.prodapt.cmsprojectmain.exceptions.ParameterNotFoundException;
import com.prodapt.cmsprojectmain.exceptions.ProductNotFoundException;
import com.prodapt.cmsprojectmain.exceptions.UserNotFoundException;
import com.prodapt.cmsprojectmain.service.FeatureService;
import com.prodapt.cmsprojectmain.service.ParameterService;
import com.prodapt.cmsprojectmain.service.ProductService;
import com.prodapt.cmsprojectmain.service.UserEntityService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RestController
@RequestMapping("/api/v1/admin")
@Tag(name = "InternetService Admin API")
public class AdminController {

	private static final Logger loggers = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private ProductService productService;

	@Autowired
	private FeatureService featureService;

	@Autowired
	private ParameterService parameterService;

	@Operation(summary = "Create Product in APP")
	@PostMapping("/addproduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		Product prd = productService.createproduct(product);
		return new ResponseEntity<Product>(prd, HttpStatus.CREATED);
	}

	@Operation(summary = "Create Feature in APP")
	@PostMapping("/addfeature")
	public ResponseEntity<Features> addFeature(@RequestBody Features feature) {

		Features features = featureService.createFeature(feature);

		return new ResponseEntity<Features>(features, HttpStatus.CREATED);
	}

	@Operation(summary = "Get Products By id")
	@GetMapping("/getproductsbyId")
	public ResponseEntity<Product> getProductById(@RequestParam("id") Long productId) throws ProductNotFoundException {

		Product product = productService.getProductById(productId);
		return new ResponseEntity<Product>(product, HttpStatus.OK);

	}

	@Operation(summary = "Get Products By name")
	@GetMapping("/getproductsbyName")
	public ResponseEntity<Product> getProductByName(@RequestParam("name") String name) throws ProductNotFoundException {

		Product product = productService.getProductByName(name);

		return new ResponseEntity<Product>(product, HttpStatus.OK);

	}

	@Operation(summary = "Get All Products")
	@GetMapping("/getallproducts")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	@Operation(summary = "Update Product in APP")
	@PutMapping("/updateproduct")
	public ResponseEntity<Product> updateProduct(@RequestParam("id") Long id, @RequestBody Product product)
			throws ProductNotFoundException {

		Product updatedProduct = productService.updateProduct(id, product);
		return new ResponseEntity<Product>(updatedProduct, HttpStatus.OK);

	}

	@Operation(summary = "Delete Product By Id")
	@PostMapping("/deleteproductbyid")
	public ResponseEntity<String> deleteProductById(@RequestParam("productId") Long productId)
			throws ProductNotFoundException {

		String deleteproduct = productService.deleteProductid(productId);
		return new ResponseEntity<String>(deleteproduct, HttpStatus.OK);

	}

	@Operation(summary = "Delete Feature By Id")
	@PostMapping("/deletefeaturebyid")
	public ResponseEntity<String> deleteFeatureById(@RequestParam("featureId") Long featureId)
			throws FeatureNotFoundException {

		String deletefeature = featureService.deleteFeatureById(featureId);
		loggers.info("Call to service layer method is success");
		return new ResponseEntity<String>(deletefeature, HttpStatus.OK);

	}

	@Operation(summary = "Delete Parameter By Id")
	@PostMapping("/deleteparameterbyid")
	public ResponseEntity<String> deleteParameterById(@RequestParam("parameterId") Long parameterId)
			throws ParameterNotFoundException {

		String deleteparameter = parameterService.deleteParameterById(parameterId);
		return new ResponseEntity<String>(deleteparameter, HttpStatus.OK);

	}

	@Autowired
	private UserEntityService userService;

	@PutMapping("/users/updaterole")
	public ResponseEntity<String> updateUserRole(@RequestParam Integer userId, @RequestBody Role role)
			throws UserNotFoundException, Exception {

		String result = userService.updateRole(userId, role);
		return ResponseEntity.ok(result);

	}

}