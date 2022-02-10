package com.thinkground.aroundhub.data.service;

import com.thinkground.aroundhub.data.dto.ProductDto;

public interface ProductService {
    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDto getProduct(String productId);
}
