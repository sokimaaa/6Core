package com._6core.platform.warehouse.rest.v1.dto;

import java.math.BigDecimal;

public record UpdateProductPriceResponse(Long productId, BigDecimal price) {
}
