package com._6core.platform.warehousespec.rest.v1.dto.inventory;

import com._6core.platform.warehousespec.rest.v1.dto.product.ProductSupplyRequest;

import java.util.List;

public record InventorySupplyResponse(String invetoryId,
                                      List<ProductSupplyRequest> products) {
}
