package com._6core.platform.deliveryspec.rest.v1;

import com._6core.platform.deliveryspec.rest.v1.dto.OrderStatusResponse;
import com._6core.platform.deliveryspec.rest.v1.dto.UpdatedOrderStatusResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

@Tag(
    name = "Delivery Sataus Management Specification",
    description = "REST reactive specification for menegment order delivery status")
public interface DeliveryStatusManagementApi {

  /**
   * Exploring order status GET /delivery/{orderId}/status
   *
   * @param orderId (required)
   * @return OK (status code 200)
   */
  @GetMapping(value = "/delivery/{orderId}/status", produces = "application/json")
  @Operation(summary = "Get orders status", description = "Get current order status")
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content = {
              @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = OrderStatusResponse.class))
            }),
        @ApiResponse(
            responseCode = "401",
            description = "Authorization information is missing or invalid"),
        @ApiResponse(responseCode = "404", description = "Order not found"),
        @ApiResponse(responseCode = "500", description = "Unexpected error")
      })
  default Mono<ResponseEntity<Object>> getOrderStatus(
      @Parameter(description = "ID of the order", required = true) @PathVariable String orderId) {
    return Mono.just(ResponseEntity.ok(new OrderStatusResponse("-1", "-1")));
  }

  /**
   * Update order status to 'Delivering'. The delivery manager gets the order and goes to the
   * customer. PATCH /delivery/{orderId}/status/delivering
   *
   * @param orderId (required)
   * @return OK (status code 200)
   */
  @PatchMapping(value = "/delivery/{orderId}/status/delivering", produces = "application/json")
  @Operation(
      summary = "Update order status to 'delivering'",
      description = "Update order status to 'delivering'")
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content = {
              @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = UpdatedOrderStatusResponse.class))
            }),
        @ApiResponse(
            responseCode = "401",
            description = "Authorization information is missing or invalid"),
        @ApiResponse(responseCode = "404", description = "Order not found"),
        @ApiResponse(responseCode = "500", description = "Unexpected error")
      })
  default Mono<ResponseEntity<Object>> updateOrderStatusDelivering(
      @Parameter(description = "ID of the order", required = true) @PathVariable String orderId) {
    return Mono.just(ResponseEntity.ok(new UpdatedOrderStatusResponse("-1", false)));
  }

  /**
   * Update order status to 'Delivered' PATCH /delivery/{orderId}/status/delivered
   *
   * @param orderId (required)
   * @return OK (status code 200)
   */
  @PatchMapping(value = "/delivery/{orderId}/status/delivered", produces = "application/json")
  @Operation(
      summary = "Update order status to 'delivered'",
      description = "Update order status to 'delivered'")
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content = {
              @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = UpdatedOrderStatusResponse.class))
            }),
        @ApiResponse(
            responseCode = "401",
            description = "Authorization information is missing or invalid"),
        @ApiResponse(responseCode = "404", description = "Order not found"),
        @ApiResponse(responseCode = "500", description = "Unexpected error")
      })
  default Mono<ResponseEntity<Object>> updateOrderStatusDelivered(
      @Parameter(description = "ID of the order", required = true) @PathVariable String orderId) {
    return Mono.just(ResponseEntity.ok(new UpdatedOrderStatusResponse("-1", false)));
  }
}
