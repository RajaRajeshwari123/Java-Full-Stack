package com.prodapt.cmsprojectmain.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.Setter;
 
@RestController
@RequestMapping("/api/v1/manager")
@Tag(name = "InternetService Manager API")
public class ManagerController {
 
	@Autowired
	private ProductService productService;
 
	@Autowired
	private QuotationService quotationService;
 
	@Autowired
	private ModelMapper modelMapper;
 
	@Autowired
	private UserEntityService userService;
 
	@Operation(summary = "Get Product By Name")
	@GetMapping("/getproductbyname")
	public ResponseEntity<Product> getProductByName(@RequestParam("name") String name) throws ProductNotFoundException {
		Product product = productService.getProductByName(name);
		return new ResponseEntity<>(product, HttpStatus.OK);
 
	}
 
	@Operation(summary = "Get Product By ID")
	@GetMapping("/getproductbyid")
	public ResponseEntity<Product> getProductById(@RequestParam("id") Long productId) throws ProductNotFoundException {
 
		Product product = productService.getProductById(productId);
		return new ResponseEntity<>(product, HttpStatus.OK);
 
	}
 
	@Operation(summary = "Get All Products")
	@GetMapping("/getallproducts")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
 
	@Operation(summary = "Add Quotation")
	@PostMapping("/addquotation")
	public ResponseEntity<QuotationDTO> addQuotation(@RequestBody QuotationDTO quotationDTO)
			throws UserNotFoundException, ProductNotFoundException {
 
		// Map QuotationDTO to Quotation entity
		Quotation quotation = modelMapper.map(quotationDTO, Quotation.class);
 
		// Manually setting user and product to avoid LazyInitializationException
		UserEntity user = userService.getUserEntityById(quotationDTO.getUserId());
		if (user == null) {
			throw new UserNotFoundException("User not found");
		}
		Product product = productService.getProductById(quotationDTO.getProductId());
		if (product == null) {
			throw new ProductNotFoundException("Product not found");
		}
		quotation.setUserEntity(user);
		quotation.setProduct(product);
 
		// Save the quotation
		Quotation savedQuotation = quotationService.addQuotation(quotation);
 
		// Map saved Quotation entity back to QuotationDTO
		QuotationDTO responseQuotationDTO = modelMapper.map(savedQuotation, QuotationDTO.class);
 
		return new ResponseEntity<>(responseQuotationDTO, HttpStatus.CREATED);
	}
 
	@Operation(summary = "Get Quotation By ID")
	@GetMapping("/getquotationbyid")
	public ResponseEntity<QuotationDTO> getQuotationById(@RequestParam("id") Long quotationId)
			throws QuotationNotFoundException {
 
		// Fetch the quotation
		Quotation quotation = quotationService.getQuotationById(quotationId);
 
		// Map Quotation entity to QuotationDTO
		QuotationDTO responseQuotationDTO = modelMapper.map(quotation, QuotationDTO.class);
 
		return new ResponseEntity<>(responseQuotationDTO, HttpStatus.OK);
	}
}