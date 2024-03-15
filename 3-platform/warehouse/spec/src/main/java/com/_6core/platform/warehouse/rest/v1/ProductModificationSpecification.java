package com._6core.platform.warehouse.rest.v1;

import com._6core.platform.warehouse.rest.v1.dto.ProductResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

/**
 * Interface for modifying product information in the Warehouse Service.
 */

@Tag(name = "Product Modification", description = "REST specification for modifying product information")
public interface ProductModificationSpecification {
    /**
     * Updates the product name for a given product identified by its ID.
     */
    @Operation(summary = "Update product name", description = "Modify the name of a product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ProductResponseDto.class))}),
            @ApiResponse(responseCode = "404", description = "Product not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
    })
    @PutMapping("/products/{productId}/name")

    public default Mono<ProductResponseDto> updateProductName(
            @PathVariable("productId") Long productId,
            @RequestBody String newName
    ) {
        ProductResponseDto mockResponse = new ProductResponseDto();
        mockResponse.setDescription("Updated name");

        return Mono.just(mockResponse);
    }

    /**
     * Updates the product price for a given product identified by its ID.
     */
    @Operation(summary = "Update product price", description = "Modify the price of a product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ProductResponseDto.class))}),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content),
    })
    @PutMapping("/products/{productId}/price")
    public default Mono<ProductResponseDto> updateProductPrice(
            @PathVariable("productId") Long productId,
            @RequestBody BigDecimal newPrice
    ) {
        ProductResponseDto mockResponse = new ProductResponseDto();
        mockResponse.setDescription("Updated price");

        return Mono.just(mockResponse);
    }

    /**
     * Updates the product description for a given product identified by its ID.
     */
    @Operation(summary = "Update product description", description = "Modify the description of a product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ProductResponseDto.class))}),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content),
    })
    @PutMapping("/products/{productId}/description")
    public default Mono<ProductResponseDto> updateProductDescription(
            @PathVariable("productId") Long productId,
            @RequestBody String newDescription
    ) {
        ProductResponseDto mockResponse = new ProductResponseDto();
        mockResponse.setDescription("Updated description");

        return Mono.just(mockResponse);
    }
}
