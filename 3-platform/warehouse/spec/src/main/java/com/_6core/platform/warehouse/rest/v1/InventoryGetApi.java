package com._6core.platform.warehouse.rest.v1;

import com._6core.platform.warehouse.rest.v1.inventory.InventoryResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Flux;

@Tag(name = "Getting inventory specification",
        description = "REST specification for getting inventory")
public interface InventoryGetApi {

    /**
     * Getting inventory by id GET /inventories/{id}
     *
     * @param id - required
     * @return OK (status code 200)
     */
    @GetMapping(value = "/inventories/{id}", produces = "application/json")
    @Operation(summary = "Get inventory by id", description = "Get inventory by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = InventoryResponse.class))}),
            @ApiResponse(responseCode = "401", description = "Authentication error"),
            @ApiResponse(responseCode = "500", description = "Internal server error")})
    default Flux<ResponseEntity<InventoryResponse>> getInventoryById(@PathVariable String id) {
        InventoryResponse mockInventory = new InventoryResponse(
                "2_7",
                "2",
                1
        );
        return Flux.just(ResponseEntity.ok(mockInventory));
    }

}
