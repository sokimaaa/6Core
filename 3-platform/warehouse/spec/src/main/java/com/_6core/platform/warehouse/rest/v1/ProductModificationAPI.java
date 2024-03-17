package com._6core.platform.warehouse.rest.v1;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

/**
 * Interface for modifying product information in the Warehouse Service.
 */

@Tag(name = "Product Modification", description = "REST specification for modifying product information")
public interface ProductModificationAPI<T, K> {
    /**
     * Updates product's name, description and price for a given product identified by its ID.
     */
    @Operation(summary = "Update product", description = "Modify details of a product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PatchMapping("/products/{productId}")
    Mono<ResponseEntity<T>> updateProduct(@PathVariable("productId") Long productId,@RequestBody K request);
}
