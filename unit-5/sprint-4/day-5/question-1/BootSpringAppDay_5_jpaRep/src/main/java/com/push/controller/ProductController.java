package com.push.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.push.exception.ProductException;
import com.push.model.Product;
import com.push.service.ProductServiceInterface;

@RestController
//@RequestMapping("/Products")
public class ProductController {
	
	@Autowired
	private ProductServiceInterface productService;
	
	
	@PostMapping("/register")
	public ResponseEntity<Product> saveProduct(@RequestBody Product p) throws ProductException{
		Product pp=productService.registerProduct(p);
		
		return new ResponseEntity<Product>(pp,HttpStatus.BAD_REQUEST);
		
	}
	
	@GetMapping("/getProduct")
	public ResponseEntity<List<Product>> getListOfProduct() throws ProductException{
		List<Product> products=productService.getAllProducts();
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.BAD_REQUEST);
	}

}
