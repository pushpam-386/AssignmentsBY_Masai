package com.push.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.push.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{

}
