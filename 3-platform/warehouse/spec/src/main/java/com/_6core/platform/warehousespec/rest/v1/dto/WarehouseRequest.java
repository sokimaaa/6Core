package com._6core.platform.warehousespec.rest.v1.dto;

import java.math.BigDecimal;

public record WarehouseRequest(
        String name,
        String description,
        Long addressId) {

}
