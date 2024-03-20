package com._6core.platform.warehousespec.rest.v1.dto.product;

import java.math.BigDecimal;

public record ProductPriceResponse(Long productId, BigDecimal price) {
}
