package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entityclasses.Products;
import RepoPackages.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }
    
	public List<Products> searchProducts(String query) {
		if (query != null && !query.isEmpty()) {
            return productRepository.findByProductNameContaining(query);
        }
        return productRepository.findAll();
	}
}
