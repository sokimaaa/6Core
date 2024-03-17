package com._6core.platform.orderspec.rest.v1.dto;

import com._6core.lib.java.domain.model.order.OrderItemV01;
import com._6core.lib.java.domain.model.order.OrderV02;
import java.math.BigInteger;
import java.util.Set;

public record OrderResponse(
        String orderId, 
        String status, 
        BigInteger total, 
        Set<OrderItemV01> orderItems, 
        String userId)
        implements OrderV02 {

}
