package com._6core.platform.warehousespec.rest.v1.dto.inventory;

public record InventoryTransferResponse( String inventoryId,
                                         String destinationLocationId,
                                         Integer quality) {
}
