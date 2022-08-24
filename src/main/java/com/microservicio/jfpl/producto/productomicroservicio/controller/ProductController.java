package com.microservicio.jfpl.producto.productomicroservicio.controller;

import com.microservicio.jfpl.producto.productomicroservicio.entity.ProductEntity;
import com.microservicio.jfpl.producto.productomicroservicio.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){

        return productRepository.findAll();

    }

    public void createProduct(@RequestBody ProductEntity productEntity)

}
