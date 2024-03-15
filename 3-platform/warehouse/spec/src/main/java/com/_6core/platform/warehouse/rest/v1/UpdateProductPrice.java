package com._6core.platform.warehouse.rest.v1;

import com._6core.platform.warehouse.rest.v1.dto.UpdateProductPriceRequest;
import com._6core.platform.warehouse.rest.v1.dto.UpdateProductPriceResponse;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface UpdateProductPrice extends ProductModificationAPI<UpdateProductPriceResponse,
        UpdateProductPriceRequest> {
    @Override
    default Mono<ResponseEntity<UpdateProductPriceResponse>> updateProduct(Long productId,
                                                                           UpdateProductPriceRequest request) {
        return ProductModificationAPI.super.updateProduct(productId, request);
    }
}
