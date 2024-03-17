package com._6core.platform.orderspec.rest.v1.dto;

import com._6core.lib.java.domain.model.order.OrderItemV01;
import java.math.BigInteger;

public record ItemResponse(
        String itemId,
        String orderId,
        String productId,
        Integer quantity,
        BigInteger price
        ) implements OrderItemV01 {

}
