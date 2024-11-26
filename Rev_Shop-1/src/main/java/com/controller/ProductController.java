package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.services.ProductService;

import Entityclasses.Products;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;
    
//    @GetMapping("/products")
//    public String viewProducts(@RequestParam(value = "query", required = false) String query, Model model) {
//        List<Products> products = productService.searchProducts(query);
//        model.addAttribute("products", products);
//        return "products"; // products.html template
//    }
    
    @GetMapping("/products")
    public String showProducts(Model model) {
        System.out.println("Accessing products page");
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

}
