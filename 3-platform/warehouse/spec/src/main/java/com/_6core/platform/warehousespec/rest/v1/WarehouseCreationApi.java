package com._6core.platform.warehousespec.rest.v1;

import com._6core.platform.warehousespec.rest.v1.dto.warehouse.WarehouseRequest;
import com._6core.platform.warehousespec.rest.v1.dto.warehouse.WarehouseResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.publisher.Flux;


@Tag(name = "Warehouse creation specification",
        description = "REST specification for warehouse creation")
public interface WarehouseCreationApi {
    /**
     * Create warehouse record by POST /warehouses
     *
     * @return CREATED (status code 201)
     */
    @Operation(summary = "Create warehouse record", description = "Create warehouse record")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "CREATED", content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = WarehouseResponse.class))}),
            @ApiResponse(responseCode = "400", description = "Field validation error"),
            @ApiResponse(responseCode = "401", description = "Authentication error"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PostMapping("/warehouses")
    default Flux<ResponseEntity<WarehouseResponse>> createWarehouse(
            WarehouseRequest request
    ) {
        WarehouseResponse mockProduct = new WarehouseResponse(
                1002L,
                "Mock warehouse name",
                "Mock warehouse description",
                1L,
                "actual"
                );
        return Flux.just(ResponseEntity
                .status(HttpStatusCode.valueOf(201))
                .body(mockProduct));
    }
}

