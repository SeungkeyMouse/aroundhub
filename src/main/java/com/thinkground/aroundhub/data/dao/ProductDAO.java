package com.thinkground.aroundhub.data.dao;

import com.thinkground.aroundhub.data.dto.ProductDto;
import com.thinkground.aroundhub.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);

}
