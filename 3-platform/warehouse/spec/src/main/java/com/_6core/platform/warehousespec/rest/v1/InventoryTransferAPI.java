package com._6core.platform.warehousespec.rest.v1;

import com._6core.platform.warehousespec.rest.v1.dto.inventory.InventoryTransferRequest;
import com._6core.platform.warehousespec.rest.v1.dto.inventory.InventoryTransferResponse;
import io.swagger.v3.oas.annotations.Operation;
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
 * Interface for allocation inventory in the Warehouse Service.
 */

@Tag(name = "Inventory allocate",
        description = "REST specification for allocation ")
public interface InventoryTransferAPI {

    /**
     * Transfer inventory in Warehouse.
     */

    @Operation(summary = "Transfer inventory", description = "Moving inventory in Warehouse")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InventoryTransferResponse.class))}),
            @ApiResponse(responseCode = "404", description = "inventory not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PatchMapping("invetory/{inventoryId}/transfer")
    default Mono<ResponseEntity<InventoryTransferResponse>> transferInventory (
            @RequestBody InventoryTransferRequest request,
            @PathVariable String inventoryId) {

        InventoryTransferResponse response
                = new InventoryTransferResponse("-1",
                "-1",
                3);

        return Mono.just(ResponseEntity.ok(response));
    }
}

