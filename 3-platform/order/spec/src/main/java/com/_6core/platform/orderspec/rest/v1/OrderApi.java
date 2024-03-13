package com._6core.platform.orderspec.rest.v1;

import com._6core.platform.orderspec.rest.v1.dto.OrderResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Tag(name = "Order Specification", description = "REST reactive specification for interaction with Order service")
public interface OrderApi {
    // Dummy property right now. Should be bringing to .property?
    final String version = "vnd.yourcompany.orders.v1";

    /**
     * Searching orders history by single user GET /orders
     * 
     * @param acceptHeader - (while request should use application version)
     * @return OK (status code 200)
     */
    @GetMapping(value = "/orders", produces = "application/" + version + "+json")
    @Operation(summary = "Get orders history", description = "Get all orders with all statuses by a single user")
    // should change content type to version above?
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = OrderResponse.class)) }),
            @ApiResponse(responseCode = "401", description = "Authorization information is missing or invalid", content = @Content),
            @ApiResponse(responseCode = "5ХХ", description = "Unexpected error", content = @Content) })
    public Flux<OrderResponse> getOrdersHistory(@RequestHeader("Accept") String acceptHeader);

    /**
     * Exploring exact order GET /orders/{orderId}
     * 
     * @param orderId      - (required)
     * @param acceptHeader - (while request should use application version)
     * @return OK (status code 200)
     */
    @GetMapping(value = "/orders/{orderId}", produces = "application/" + version + "+json")
    @Operation(summary = "Get order details", description = "Get details of a specific order by order ID")
    // should change content type to version above?
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = OrderResponse.class)) }),
            @ApiResponse(responseCode = "400", description = "Bad request. Order ID must be an long and larger than 0", content = @Content),
            @ApiResponse(responseCode = "401", description = "Authorization information is missing or invalid", content = @Content),
            @ApiResponse(responseCode = "404", description = "Order not found", content = @Content),
            @ApiResponse(responseCode = "5ХХ", description = "Unexpected error", content = @Content) })
    public Mono<OrderResponse> getOrder(@Parameter(description = "ID of the order", required = true) @PathVariable Long orderId,
            @RequestHeader("Accept") String acceptHeader);

    // how there use AppContext?
    // versioning?
}
