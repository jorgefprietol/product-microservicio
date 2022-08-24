package com.microservicio.jfpl.producto.productomicroservicio.repository;

import com.microservicio.jfpl.producto.productomicroservicio.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
