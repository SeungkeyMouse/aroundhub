package com.thinkground.aroundhub.data.repository;

import com.thinkground.aroundhub.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
