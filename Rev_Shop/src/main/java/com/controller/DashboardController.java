package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
@RequestMapping("/")
public String DashboardController() {
	   return "Seller"; // This maps to views/Seller.jsp
	  }
}