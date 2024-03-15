package com._6core.platform.warehouse.rest.v1;

import com._6core.platform.warehouse.rest.v1.dto.UpdateProductDescriptionRequest;
import com._6core.platform.warehouse.rest.v1.dto.UpdateProductDescriptionResponse;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface UpdateProductDescription extends
        ProductModificationAPI<UpdateProductDescriptionResponse, UpdateProductDescriptionRequest>{
    @Override
    default Mono<ResponseEntity<UpdateProductDescriptionResponse>> updateProduct(Long productId,
                                                                                 UpdateProductDescriptionRequest request) {
        return ProductModificationAPI.super.updateProduct(productId, request);
    }
}
