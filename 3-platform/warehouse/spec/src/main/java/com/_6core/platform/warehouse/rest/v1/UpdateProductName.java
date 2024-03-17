package com._6core.platform.warehouse.rest.v1;

import com._6core.platform.warehouse.rest.v1.dto.product.RequestProductName;
import com._6core.platform.warehouse.rest.v1.dto.product.ResponseProductDescription;
import com._6core.platform.warehouse.rest.v1.dto.product.ResponseProductName;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

/**
 * Interface for modifying product name in the Warehouse Service.
 */

@Tag(name = "Updating product's name", description = "REST specification for modifying product information")
public interface UpdateProductName
        extends ProductModificationAPI<ResponseProductName, RequestProductName> {

    /**
     * Updates product's name for a given product identified by its ID.
     */

    @Operation(summary = "Update  product's name", description = "Modify the name of a product")
    @ApiResponse(responseCode = "200", description = "OK", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseProductName.class))
    })
    @Override
    default Mono<ResponseEntity<ResponseProductName>> updateProduct(Long productId,
                                                                    RequestProductName request) {
        ResponseProductName response
                = new ResponseProductName(-1L, "updated");
        return Mono.just(ResponseEntity.ok(response));
    }
}
