package com._6core.platform.warehouse.rest.v1;

import com._6core.platform.warehouse.rest.v1.dto.UpdateProductNameRequest;
import com._6core.platform.warehouse.rest.v1.dto.UpdateProductNameResponse;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface UpdateProductName
        extends ProductModificationAPI<UpdateProductNameResponse, UpdateProductNameRequest> {
    @Override
    default Mono<ResponseEntity<UpdateProductNameResponse>> updateProduct(Long productId,
                                                                          UpdateProductNameRequest request) {
        return ProductModificationAPI.super.updateProduct(productId, request);
    }
}
