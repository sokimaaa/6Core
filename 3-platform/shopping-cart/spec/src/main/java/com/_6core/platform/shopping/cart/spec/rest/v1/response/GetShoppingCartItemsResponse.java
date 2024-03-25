package com._6core.platform.shopping.cart.spec.rest.v1.response;

import java.io.Serializable;
import java.util.List;

public record GetShoppingCartItemsResponse(Long cartId, List<Long> products, Boolean ok)
    implements Serializable {}
