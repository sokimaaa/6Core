package com._6core.platform.warehouse.rest.v1;

import com._6core.platform.warehouse.rest.v1.dto.UpdateProductDescriptionRequest;
import com._6core.platform.warehouse.rest.v1.dto.UpdateProductDescriptionResponse;
import com._6core.platform.warehouse.rest.v1.dto.UpdateProductNameResponse;
import com._6core.platform.warehouse.rest.v1.dto.UpdateProductNameRequest;
import com._6core.platform.warehouse.rest.v1.dto.UpdateProductPriceRequest;
import com._6core.platform.warehouse.rest.v1.dto.UpdateProductPriceResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import reactor.core.publisher.Mono;

/**
 * Interface for modifying product information in the Warehouse Service.
 */

@Tag(name = "Product Modification", description = "REST specification for modifying product information")
public interface ProductModificationAPI<T, K> {
    /**
     * Updates the product name for a given product identified by its ID.
     */
    @Operation(summary = "Update product name", description = "Modify the name of a product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PatchMapping("/products/{productId}")
    default Mono<ResponseEntity<T>> updateProduct(
            @PathVariable("productId") Long productId,
            @RequestBody K request
    ) {

        return Mono.empty();
    }
}
