package com._6core.platform.warehouse.rest.v1;

import com._6core.platform.warehouse.rest.v1.dto.product.RequestProductPrice;
import com._6core.platform.warehouse.rest.v1.dto.product.ResponseProductName;
import com._6core.platform.warehouse.rest.v1.dto.product.ResponseProductPrice;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

/**
 * Interface for modifying product price in the Warehouse Service.
 */

@Tag(name = "Updating product's price", description = "REST specification for modifying product information")
public interface UpdateProductPrice extends ProductModificationAPI<ResponseProductPrice,
        RequestProductPrice> {

    /**
     * Updates product's price for a given product identified by its ID
     */

    @Operation(summary = "Update product name", description = "Modify the name of a product")
    @ApiResponse(responseCode = "200", description = "OK", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseProductName.class))
    })
    @Override
    default Mono<ResponseEntity<ResponseProductPrice>> updateProduct(Long productId,
                                                                     RequestProductPrice request) {
        ResponseProductPrice response
                = new ResponseProductPrice(-1L, new BigDecimal("123.45"));
        return Mono.just(ResponseEntity.ok(response));
    }
}
