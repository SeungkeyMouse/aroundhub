package com.thinkground.aroundhub.data.entity;

import com.thinkground.aroundhub.data.dto.ProductDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity {
    @Id
    String productId;//primaryKey

    String productName;
    int productPrice;
    int productStock;

    public ProductDto toDto(){
        return ProductDto.builder()
                .build();
    }
}
