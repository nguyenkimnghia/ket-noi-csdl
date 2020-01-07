package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.impl.ProductRepositoryImpl;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepositoryImpl productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
