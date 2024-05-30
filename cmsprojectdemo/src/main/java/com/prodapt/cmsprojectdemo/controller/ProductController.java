package com.prodapt.cmsprojectdemo.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.cmsprojectdemo.entities.Features;
import com.prodapt.cmsprojectdemo.entities.Parameter;
import com.prodapt.cmsprojectdemo.entities.Product;
import com.prodapt.cmsprojectdemo.exceptions.FeatureNotFoundException;
import com.prodapt.cmsprojectdemo.exceptions.NoRecordFoundException;
import com.prodapt.cmsprojectdemo.exceptions.ParameterNotFoundException;
import com.prodapt.cmsprojectdemo.exceptions.ProductNotFoundException;
import com.prodapt.cmsprojectdemo.service.FeatureService;
import com.prodapt.cmsprojectdemo.service.ParameterService;
import com.prodapt.cmsprojectdemo.service.ProductService;
//import com.prodapt.restapiexample.entities.Person;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/api/v1/productapp")
@Tag(name="InternetService Product API")

public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController .class);
	@Autowired
	private ProductService service;
	
	@Autowired
	private FeatureService service1;
	
	@Autowired
    private ParameterService parameterService;
	
	
	
	@Operation(summary = "Create Product in APP")
	@PostMapping("/addproduct")
	public ResponseEntity<Product> addActor(@RequestBody Product product){
		logger.info("Inside addProduct +"+ ProductController.class.getName());
		Product prd = service.createProduct(product);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<Product>(prd, HttpStatus.CREATED);
	}
	
	@Operation(summary = "Create Feature in APP")
	@PostMapping("/addfeature")
	public ResponseEntity<Features> addfeature(@RequestBody Features feature){
		logger.info("Inside addFeatures +"+ ProductController.class.getName());
		Features features = service1.createFeature(feature);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<Features>(features, HttpStatus.CREATED);
		
	}
	
	@Operation(summary = "Create Parameter in APP")
	@PostMapping("/addparameter")
	public ResponseEntity<Parameter> addparameter(@RequestBody Parameter parameter){
		logger.info("Inside addParameter +"+ ProductController.class.getName());
		Parameter param=parameterService.createParameter(parameter);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<Parameter>(param, HttpStatus.CREATED);
		
	}
	@Operation(summary = "Get Products By id")
	@GetMapping("/getproductsbyId")
	public ResponseEntity<Product> getProductById(@RequestParam("id") Long productId) throws  ProductNotFoundException{
		logger.info("Inside getProductById +"+ ProductController.class.getName());
		Product product = service.getProductById(productId);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<Product>(product, HttpStatus.FOUND);
	}
	
	@Operation(summary = "Get Products By name")
	@GetMapping("/getproductsbyName")
	public ResponseEntity<Product> getProductByName(@RequestParam("name") String name) throws  ProductNotFoundException{
		logger.info("Inside getProductById +"+ ProductController.class.getName());
		Product product = service. getProductByName(name);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<Product>(product, HttpStatus.FOUND);
	}
	@Operation(summary="Update Products")
	@PostMapping("/updateproductbyid")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) throws ProductNotFoundException {
		logger.info("Inside updateProductById +"+ ProductController.class.getName());
		Product updateproduct=service.updateProduct(product);
//		String message = service.updateProduct(prod);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<Product>(updateproduct, HttpStatus.FOUND);
	}
	@Operation(summary="Delete Products By Id")
	@PostMapping("/deleteproductbyid")
	public ResponseEntity<Product> deleteProductById(@RequestParam("productId") Long productId)
			throws ProductNotFoundException {
		logger.info("Inside DeleteProductById +"+ ProductController.class.getName());
		Product deleteproduct = service.deleteProductById(productId);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<Product>(deleteproduct, HttpStatus.FOUND);
	}
	@Operation(summary="Delete Feature By Id")
	@PostMapping("/deletefeaturebyid")
	public ResponseEntity<Features> deleteFeatureById(@RequestParam("featuretId") Long featureId)
			throws FeatureNotFoundException {
		logger.info("Inside DeleteFeatureById +"+ ProductController.class.getName());
		Features deletefeature = service1.deleteFeatureById(featureId);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<Features>(deletefeature, HttpStatus.FOUND);
	}
	@Operation(summary="Delete Parameter By Id")
	@PostMapping("/deleteparameterbyid")
	public ResponseEntity<Parameter> deleteParameterById(@RequestParam("parameterId") Long parameterId)
			throws ParameterNotFoundException {
		logger.info("Inside DeleteParameterById +"+ ProductController.class.getName());
		Parameter deleteparameter = parameterService.deleteParameterById(parameterId);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<Parameter>(deleteparameter, HttpStatus.FOUND);
	}
	@GetMapping("/getallproduct")
    public ResponseEntity<List<Product>> getAllProducts() throws ProductNotFoundException, NoRecordFoundException {
        logger.info("Inside getallproducts +" + ProductController.class.getName());
        List<Product> products = service.getAllProducts();
        logger.info("Retrieved all products successfully");
        return new ResponseEntity<>(products, HttpStatus.FOUND);
    }
	

}