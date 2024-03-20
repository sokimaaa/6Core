package com._6core.platform.warehouse.rest.v1.inventory;

public record Inventory(
        String inventoryId,
        String warehouseId,
        String productId,
        Integer actualQuantity,
        Integer availableQuantity
) {
}
