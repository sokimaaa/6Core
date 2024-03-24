package com._6core.platform.shopping.cart.spec.rest.v1.response;

import java.io.Serializable;

public record PutShoppingCartItemResponse(Long cartId, Long productId, Boolean ok)
    implements Serializable {}
