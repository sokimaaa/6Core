package com._6core.platform.warehousespec.rest.v1.dto.inventory;

public record InventoryTransferRequest(String inventoryId,
                                       String sourceLocationId,
                                       String destinationLocationId,
                                       Integer quality) {
}
