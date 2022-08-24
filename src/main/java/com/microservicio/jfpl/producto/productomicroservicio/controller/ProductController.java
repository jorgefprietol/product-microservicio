package com.microservicio.jfpl.producto.productomicroservicio.controller;

import com.microservicio.jfpl.producto.productomicroservicio.entity.ProductEntity;
import com.microservicio.jfpl.producto.productomicroservicio.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    /*
    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllProduct(){

        List<ProductEntity> productEntities = productRepository.findAll();
        ResponseEntity<List<ProductEntity>> responseEntity = new ResponseEntity<>(productEntities, HttpStatus.OK);
        return responseEntity;

    }
     */

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductEntity productEntity){

        productRepository.save(productEntity);

    }

}
