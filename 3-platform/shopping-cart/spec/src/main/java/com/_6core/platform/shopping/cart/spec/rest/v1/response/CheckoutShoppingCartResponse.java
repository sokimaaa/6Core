package com._6core.platform.shopping.cart.spec.rest.v1.response;

import java.io.Serializable;

public record CheckoutShoppingCartResponse(
    Long cartId, Long transactionId, Long orderId, Boolean ok) implements Serializable {}
