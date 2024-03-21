package com._6core.platform.warehousespec.rest.v1;

import com._6core.platform.warehousespec.rest.v1.dto.inventory.InventorySupplyRequest;
import com._6core.platform.warehousespec.rest.v1.dto.inventory.InventorySupplyResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;

/**
 * Interface for supplying new products to the inventory in the Warehouse Service.
 *
 * This interface defines a single method for supplying new products to the inventory.
 */

@Tag(name = "Inventory supplying",
        description = "REST specification for supplying")
public interface InventorySupplyApi {

    /**
     * Supplies a list of products to the inventory identified by the given inventory ID.
     *
     * This operation allows you to add new products to an existing inventory item. The provided
     * `inventoryId` should correspond to an existing inventory item in the system. The `products` list
     * contains details about the products to be supplied, including their IDs and quantities.
     *
     * @param inventoryId The ID of the inventory item to which the products will be supplied.
     *                 the products to be supplied.
     * @return A {@link Mono} that emits a {@link ResponseEntity} containing
     * the {@link InventorySupplyResponse} object.
     *         - The response status code will be:
     *             - 200 (OK) - if the products are successfully supplied to the inventory.
     *             - 404 (Not Found) - if the inventory item with the provided ID is not found.
     *             - 500 (Internal Server Error) - if an unexpected error occurs during the supply process.
     */
    @Operation(summary = "Supply products to inventory", description = "Supplying new products to inventory")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InventorySupplyResponse.class))}),
            @ApiResponse(responseCode = "404", description = "inventory not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PatchMapping("inventory/{inventoryId}/supply")
   default Mono<ResponseEntity<InventorySupplyResponse>> supplyInventory(
            @Parameter(description  = "inventory ID") @PathVariable String inventoryId,
            @RequestBody InventorySupplyRequest request) {

        InventorySupplyResponse response
                = new InventorySupplyResponse("-1",
                "-1",
                3);

        return Mono.just(ResponseEntity.ok(response));
    }
}
