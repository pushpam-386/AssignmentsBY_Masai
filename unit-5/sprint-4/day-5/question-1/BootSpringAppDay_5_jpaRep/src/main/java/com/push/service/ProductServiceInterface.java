package com.push.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.push.exception.ProductException;
import com.push.model.Product;
import com.push.model.ProductDTO;

@Service
public interface ProductServiceInterface {

	public Product registerProduct(Product p)throws ProductException;
	public List<Product> getAllProducts()throws ProductException;
	public Product updateProdcut(Product p)throws ProductException;
	public Product deleteProductById(Integer pid)throws ProductException;
	public List<Product> getsProductByCategory(String category)throws ProductException;
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException;

}
