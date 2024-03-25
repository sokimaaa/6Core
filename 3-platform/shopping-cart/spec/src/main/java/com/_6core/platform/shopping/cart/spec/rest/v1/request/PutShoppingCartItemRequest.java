package com._6core.platform.shopping.cart.spec.rest.v1.request;

import java.io.Serializable;

public record PutShoppingCartItemRequest(Long productId) implements Serializable {}
