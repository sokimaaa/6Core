package com._6core.platform.warehouse.rest.v1.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductResponseDto {
   private Long Id;
    private String name;
    private BigDecimal price;
    private String description;
}
