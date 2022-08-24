package com.microservicio.jfpl.producto.productomicroservicio.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
@Getter
@Setter
public class CategoryController {

    @Value("${app.testProp}")
    private  String testProp;

    public String getTestProp(){

        return this.testProp;

    }

}
