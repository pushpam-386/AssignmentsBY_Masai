package com.push.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.push.Repo.ProductDao;
import com.push.exception.ProductException;
import com.push.model.Product;
import com.push.model.ProductDTO;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class ProductServiceImplementation implements ProductServiceInterface{
	
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Product registerProduct(Product p) throws ProductException {
		Product product=productDao.save(p);
		if (product!=null) {
			return product;
		}
		else {
			throw new ProductException("Product Not Saved");
		}
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		
		List<Product> pList=productDao.findAll();
		
		if (!pList.isEmpty()) {
			return pList;
		}
		else {
			throw new ProductException("No Product Is There");
		}
	}	

	@Override
	public Product updateProdcut(Product p) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteProductById(Integer pid) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getsProductByCategory(String category) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

}
