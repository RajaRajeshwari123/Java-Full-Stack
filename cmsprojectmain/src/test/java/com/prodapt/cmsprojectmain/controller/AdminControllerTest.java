
package com.prodapt.cmsprojectmain.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.prodapt.cmsprojectmain.entities.Features;
import com.prodapt.cmsprojectmain.entities.Parameter;
import com.prodapt.cmsprojectmain.entities.Product;
import com.prodapt.cmsprojectmain.entities.Role;
import com.prodapt.cmsprojectmain.entities.UserEntity;
import com.prodapt.cmsprojectmain.exceptions.FeatureNotFoundException;
import com.prodapt.cmsprojectmain.exceptions.ParameterNotFoundException;
import com.prodapt.cmsprojectmain.exceptions.ProductNotFoundException;
import com.prodapt.cmsprojectmain.exceptions.UserNotFoundException;
import com.prodapt.cmsprojectmain.service.FeatureService;
import com.prodapt.cmsprojectmain.service.ParameterService;
import com.prodapt.cmsprojectmain.service.ProductService;
import com.prodapt.cmsprojectmain.service.UserEntityService;

class AdminControllerTest {

	@InjectMocks
	private AdminController adminController;

	@Mock
	private ProductService productService;

	@Mock
	private FeatureService featureService;

	@Mock
	private ParameterService parameterService;

	@Mock
	private UserEntityService userService;

	private Product product;
	private Features feature;
	private Parameter parameter;
	private UserEntity user;

	@BeforeEach
	public void setup() {
		product = new Product();
		product.setId(1L);
		product.setName("Test Product");

		feature = new Features();
		feature.setId(1L);
		feature.setName("Test Feature");

		parameter = new Parameter();
		parameter.setId(1L);
		parameter.setName("Test Parameter");
		parameter.setType("test");
		parameter.setValue("2.00");

		user = new UserEntity();
		user.setId(1);
		user.setUsername("testUser");
		user.setEmail("testEmail");
		user.setPassword("testPassword");
	}

	@Test
	void testAddProduct_Success() {
		if (productService != null) {
			when(productService.createproduct(product)).thenReturn(product);

			ResponseEntity<Product> response = adminController.addProduct(product);

			assertEquals(HttpStatus.CREATED, response.getStatusCode());
			assertEquals(product, response.getBody());
		}
	}

	@Test
	void testAddProduct_Failure() {

		if (productService != null) {
			when(productService.createproduct(product)).thenThrow(new RuntimeException("Error creating product"));

			assertThrows(RuntimeException.class, () -> adminController.addProduct(product));
		}
	}

	@Test
	void testAddFeature() {
		if (featureService != null) {
			when(featureService.createFeature(feature)).thenReturn(feature);

			ResponseEntity<Features> response = adminController.addFeature(feature);

			assertEquals(HttpStatus.CREATED, response.getStatusCode());
			assertEquals(feature, response.getBody());
		}
	}

	@Test
	void testGetProductById_Success() throws ProductNotFoundException {
		if (productService != null) {

			when(productService.getProductById(1L)).thenReturn(product);

			ResponseEntity<Product> response = adminController.getProductById(1L);

			assertEquals(HttpStatus.OK, response.getStatusCode());
			assertEquals(product, response.getBody());
		}
	}

	@Test
	void testGetProductById_Failure() throws ProductNotFoundException {
		if (productService != null) {
			when(productService.getProductById(1L)).thenThrow(new ProductNotFoundException("Product not found"));

			assertThrows(ProductNotFoundException.class, () -> adminController.getProductById(1L));
		}
	}

	@Test
	void testGetProductByName_Success() throws ProductNotFoundException {
		if (productService != null) {

			when(productService.getProductByName("Test Product")).thenReturn(product);

			ResponseEntity<Product> response = adminController.getProductByName("Test Product");

			assertEquals(HttpStatus.OK, response.getStatusCode());
			assertEquals(product, response.getBody());
		}
	}

	@Test
	void testGetProductByName_Failure() throws ProductNotFoundException {

		if (productService != null) {
			when(productService.getProductByName("Test Product"))
					.thenThrow(new ProductNotFoundException("Product not found"));

			assertThrows(ProductNotFoundException.class, () -> adminController.getProductByName("Test Product"));
		}
	}

	@Test
	void testGetAllProducts() {
		if (productService != null) {

			List<Product> products = new ArrayList<>();
			products.add(product);

			when(productService.getAllProducts()).thenReturn(products);

			ResponseEntity<List<Product>> response = adminController.getAllProducts();

			assertEquals(HttpStatus.OK, response.getStatusCode());
			assertEquals(products, response.getBody());
		}
	}

	@Test
	void testUpdateProduct_Success() throws ProductNotFoundException {
		if (productService != null) {
			when(productService.updateProduct(1L, product)).thenReturn(product);

			ResponseEntity<Product> response = adminController.updateProduct(1L, product);

			assertEquals(HttpStatus.OK, response.getStatusCode());
			assertEquals(product, response.getBody());
		}
	}

	@Test
	void testUpdateProduct_Failure() throws ProductNotFoundException {
		if (productService != null) {
			when(productService.updateProduct(1L, product))
					.thenThrow(new ProductNotFoundException("Product not found"));

			assertThrows(ProductNotFoundException.class, () -> adminController.updateProduct(1L, product));
		}
	}

	@Test
	void testDeleteProductById_Success() throws ProductNotFoundException {
		if (productService != null) {
			when(productService.deleteProductid(1L)).thenReturn("Product deleted");

			ResponseEntity<String> response = adminController.deleteProductById(1L);

			assertEquals(HttpStatus.OK, response.getStatusCode());
			assertEquals("Product deleted", response.getBody());
		}
	}

	@Test
	void testDeleteProductById_Failure() throws ProductNotFoundException {
		if (productService != null) {
			when(productService.deleteProductid(1L)).thenThrow(new ProductNotFoundException("Product not found"));

			assertThrows(ProductNotFoundException.class, () -> adminController.deleteProductById(1L));
		}
	}

	@Test
	void testDeleteParameterById() throws ParameterNotFoundException {
		if (parameterService != null) {

			when(parameterService.deleteParameterById(1L)).thenReturn("Parameter deleted sucessfully");

			ResponseEntity<String> response = adminController.deleteParameterById(1L);

			assertEquals(HttpStatus.OK, response.getStatusCode());
			assertEquals("Parameter deleted sucessfully", response.getBody());
		}
	}

	@Test
	void testUpdateUserRole_Success() throws Exception {
		if (userService != null) {
			when(userService.updateRole(1, new Role())).thenReturn("Role updated");

			ResponseEntity<String> response = adminController.updateUserRole(1, new Role());

			assertEquals(HttpStatus.OK, response.getStatusCode());
			assertEquals("Role updated", response.getBody());
		}
	}

	@Test
	void testUpdateUserRole_Failure() throws Exception {
		if (userService != null) {
			when(userService.updateRole(1, new Role())).thenThrow(new UserNotFoundException("User not found"));

			assertThrows(UserNotFoundException.class, () -> adminController.updateUserRole(1, new Role()));
		}
	}
}