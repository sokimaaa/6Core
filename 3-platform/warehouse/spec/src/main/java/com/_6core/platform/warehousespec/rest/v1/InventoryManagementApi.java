package com._6core.platform.warehousespec.rest.v1;

import com._6core.platform.warehousespec.rest.v1.dto.inventory.InventoryAllocateRequest;
import com._6core.platform.warehousespec.rest.v1.dto.inventory.InventoryAllocateResponse;
import com._6core.platform.warehousespec.rest.v1.dto.inventory.InventorySupplyRequest;
import com._6core.platform.warehousespec.rest.v1.dto.inventory.InventorySupplyResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.publisher.Mono;

/**
 * Interface for allocation inventory in the Warehouse Service.
 */

@Tag(name = "Inventory management",
        description = "REST specification for allocating the inventory and for supplying to the existing inventory")
public interface InventoryManagementApi {

    /**
     * Transfers inventory within the warehouse system.
     *
     * This API endpoint allows you to move inventory items from one location to another within the warehouse.
     *
     *  - The response status code will be:
     *      - 200 (OK) - if the inventory transfer is successful.
     *      - 404 (Not Found) - if the inventory item with the provided ID is not found.
     *      - 500 (Internal Server Error) - if an unexpected error occurs during the transfer process.
     */

    @Operation(summary = "Transfer inventory", description = "Moving inventory in Warehouse")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InventoryAllocateResponse.class))}),
            @ApiResponse(responseCode = "400", description = "Field validation error"),
            @ApiResponse(responseCode = "401", description = "Authentication error"),
            @ApiResponse(responseCode = "404", description = "inventory not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PostMapping("/inventory/allocate")
    default Mono<ResponseEntity<InventoryAllocateResponse>> inventoryAllocate (
            InventoryAllocateRequest request) {
        InventoryAllocateResponse response
                = new InventoryAllocateResponse("-1Locate", "-1WH","-1Inv", 3);
        return Mono.just(ResponseEntity.ok(response));
    }

    /**
     * Supplies a list of products to the inventory identified by the given inventory ID.
     *
     * This operation allows you to add new products to an existing inventory item. The provided
     * `inventoryId` should correspond to an existing inventory item in the system. The `products` list
     * contains details about the products to be supplied, including their IDs and quantities.
     *
     *  - The response status code will be:
     *      - 200 (OK) - if the inventory transfer is successful.
     *      - 404 (Not Found) - if the inventory item with the provided ID is not found.
     *      - 500 (Internal Server Error) - if an unexpected error occurs during the transfer process.
     */
    @Operation(summary = "Supply products to inventory", description = "Supplying new products to inventory")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InventorySupplyResponse.class))}),
            @ApiResponse(responseCode = "400", description = "Field validation error"),
            @ApiResponse(responseCode = "401", description = "Authentication error"),
            @ApiResponse(responseCode = "404", description = "Inventory not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PatchMapping("/inventory/{inventoryId}/supply")
    default Mono<ResponseEntity<InventorySupplyResponse>> supplyInventory(
            String inventoryId,
            InventorySupplyRequest request) {

        InventorySupplyResponse response
                = new InventorySupplyResponse("-1","-1",3);
        return Mono.just(ResponseEntity.ok(response));
    }

}

