package com._6core.platform.warehousespec.rest.v1.dto.product;

import java.math.BigInteger;

public record ProductCartResponse(
    String productId, String name, String image, BigInteger price, Boolean isAvailable) {}
