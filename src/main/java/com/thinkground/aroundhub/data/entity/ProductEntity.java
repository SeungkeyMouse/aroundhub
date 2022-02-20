package com.thinkground.aroundhub.data.entity;

import com.thinkground.aroundhub.data.dto.ProductDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "product")
public class ProductEntity extends BaseEntity {
    @Id
    String productId;//primaryKey

    String productName;

    Integer productPrice;

    Integer productStock;

    public ProductDto toDto() {
        return ProductDto.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }
}
