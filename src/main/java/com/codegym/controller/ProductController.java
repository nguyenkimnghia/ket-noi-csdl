package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/product")
    public ModelAndView getAllProduct(){

        List<Product> productList = productService.findAll();
         ModelAndView modelAndView = new ModelAndView("product/list");
         modelAndView.addObject("product",productList);
         return modelAndView;
    }
}
