package com._6core.platform.warehousespec.rest.v1;

import com._6core.platform.warehousespec.rest.v1.dto.product.ProductDetailsResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.math.BigInteger;
import java.util.Map;
import java.util.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Flux;

@Tag(name = "Product Receive Specification", description = "REST reactive specification for getting products from warehouse service")
public interface ProductGetApi {
    /*
     * Acceptance Criteria - Defined the Request, Response objects - Defined the
     * Interface for interacting with the Warehouse Service - Well-documented
     * specification with JavaDoc and OpenApi - Design filtering feature
     */

    // referance:
    // https://rozetka.com.ua/lepka4632166/c4632166/detskiy-vozrast=14-let,18-let;price=129-189;producer=danko-toys/
    /**
     * Exploring the products by filter criteria. Provide all products with given
     * filters. If any tags provided then return all products.
     * 
     * @param filterCreteria (non required params)
     * @return OK (status code 200)
     */
    @GetMapping(value = "/products", produces = "application/json")
    @Operation(summary = "Get products by filter creteria", description = "Get all products by specified filters")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class)) }),
            @ApiResponse(responseCode = "400", description = "Bad request. Requested parameters doesn't exist"),
            @ApiResponse(responseCode = "401", description = "Authorization information is missing or invalid"),
            @ApiResponse(responseCode = "404", description = "Products not found"),
            @ApiResponse(responseCode = "500", description = "Unexpected error") })
    default Flux<ResponseEntity<Object>> getProductsByCreteria(@RequestParam(required = false) Map<String, Set<String>> filterCreteria) {
        // try test it
        // return list of a products by creterias
        // if nothing specifiead return all
        return null;
    }

    /**
     * Exploring exact product with all details GET /products/{productId}/details
     * 
     * @param productId (required)
     * @return OK (status code 200)
     */
    @GetMapping(value = "/products/{productId}/details", produces = "application/json")
    @Operation(summary = "Get product details", description = "Get details of a specific product by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ProductDetailsResponse.class)) }),
            @ApiResponse(responseCode = "400", description = "Bad request. Requested parameter doesn't exist"),
            @ApiResponse(responseCode = "401", description = "Authorization information is missing or invalid"),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Unexpected error") })
    default Flux<ResponseEntity<ProductDetailsResponse>> getProduct(
            @Parameter(description = "ID of the product", required = true) @PathVariable String productId) {
        ProductDetailsResponse mockResponse = new ProductDetailsResponse("-1", "-1", "-1", "-1", BigInteger.valueOf(-1L), "-1", false);
        return Flux.just(ResponseEntity.ok().body(mockResponse));
    }
}
