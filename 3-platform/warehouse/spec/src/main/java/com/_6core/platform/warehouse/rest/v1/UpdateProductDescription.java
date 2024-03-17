package com._6core.platform.warehouse.rest.v1;

import com._6core.platform.warehouse.rest.v1.dto.product.RequestProductDescription;
import com._6core.platform.warehouse.rest.v1.dto.product.ResponseProductDescription;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

/**
 * Interface for modifying product description in the Warehouse Service.
 */

@Tag(name = "Updating product's description", description = "REST specification for modifying product information")
public interface UpdateProductDescription extends
        ProductModificationAPI<ResponseProductDescription, RequestProductDescription>{

    /**
     * Updates product's description for a given product identified by its ID.
     */

    @Operation(summary = "Update product description", description = "Modify the description of a product")
    @ApiResponse(responseCode = "200", description = "OK", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseProductDescription.class))
    })
    @Override
    default Mono<ResponseEntity<ResponseProductDescription>> updateProduct(Long productId,
                                                                           RequestProductDescription request) {

        ResponseProductDescription response
                = new ResponseProductDescription(-1L, "updated");
        return Mono.just(ResponseEntity.ok(response));
    }
}
