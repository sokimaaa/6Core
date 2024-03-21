package com._6core.platform.orderspec.rest.v1.dto;

import java.math.BigInteger;
import java.util.Set;

public record OrderResponse(
        String orderId, 
        String status, 
        BigInteger total, 
        Set<String> orderItemIds, 
        String userId){
}
