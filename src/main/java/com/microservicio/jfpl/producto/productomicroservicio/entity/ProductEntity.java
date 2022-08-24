package com.microservicio.jfpl.producto.productomicroservicio.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
@Getter
@Setter
public class ProductEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String productName;
    private String productDescription;
    private Double unitPrice;

}
