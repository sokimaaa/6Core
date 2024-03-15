package com._6core.platform.warehouse.rest.v1.dto;

import java.math.BigDecimal;

public record UpdateProductPriceRequest(Long productId, BigDecimal price) {
}
