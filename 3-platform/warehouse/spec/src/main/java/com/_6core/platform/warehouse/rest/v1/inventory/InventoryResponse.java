package com._6core.platform.warehouse.rest.v1.inventory;

public record InventoryResponse(
        String inventoryId,
        String productId,
        Integer quantity
) {
}
