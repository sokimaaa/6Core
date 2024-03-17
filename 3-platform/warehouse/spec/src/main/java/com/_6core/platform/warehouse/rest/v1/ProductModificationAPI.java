package com._6core.platform.warehouse.rest.v1;

import com._6core.platform.warehouse.rest.v1.dto.product.RequestProductDescription;
import com._6core.platform.warehouse.rest.v1.dto.product.RequestProductName;
import com._6core.platform.warehouse.rest.v1.dto.product.RequestProductPrice;
import com._6core.platform.warehouse.rest.v1.dto.product.ResponseProductDescription;
import com._6core.platform.warehouse.rest.v1.dto.product.ResponseProductName;
import com._6core.platform.warehouse.rest.v1.dto.product.ResponseProductPrice;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import reactor.core.publisher.Mono;
import java.math.BigDecimal;

/**
 * Interface for modifying product information in the Warehouse Service.
 */

@Tag(name = "Product Modification", description = "REST specification for modifying product information")
public interface ProductModificationAPI {
    /**
     * Update product's description for a given product identified by its ID.
     */
    @Operation(summary = "Update product description", description = "Modify the description of a product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseProductDescription.class))}),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PatchMapping("/products/{productId}/description")
    default Mono<ResponseEntity<ResponseProductDescription>> updateProduct(Long productId,
                                                                           RequestProductDescription request) {

        ResponseProductDescription response
                = new ResponseProductDescription(-1L, "updated");
        return Mono.just(ResponseEntity.ok(response));
    }

    /**
     * Update product's name for a given product identified by its ID.
     */
    @Operation(summary = "Update product description", description = "Modify the description of a product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseProductName.class))}),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PatchMapping("/products/{productId}/name")
    default Mono<ResponseEntity<ResponseProductName>> updateProduct(Long productId,
                                                                    RequestProductName request) {
        ResponseProductName response
                = new ResponseProductName(-1L, "updated");
        return Mono.just(ResponseEntity.ok(response));
    }

    /**
     * Update product's price for a given product identified by its ID
     */

    @Operation(summary = "Update product description", description = "Modify the description of a product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseProductPrice.class))}),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PatchMapping("/products/{productId}/price")
    default Mono<ResponseEntity<ResponseProductPrice>> updateProduct(Long productId,
                                                                     RequestProductPrice request) {
        ResponseProductPrice response
                = new ResponseProductPrice(-1L, new BigDecimal("123.45"));
        return Mono.just(ResponseEntity.ok(response));
    }
}
