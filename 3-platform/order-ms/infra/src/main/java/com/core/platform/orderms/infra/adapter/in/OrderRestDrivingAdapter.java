package com.core.platform.orderms.infra.adapter.in;

import com.core.platform.orderms.app.OrderUseCase;
import com.core.platform.orderms.domain.model.OrderRecord;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class OrderRestDrivingAdapter {
    private final OrderUseCase domainUseCase;

    public OrderRestDrivingAdapter(final OrderUseCase domainUseCase) {
        this.domainUseCase = domainUseCase;
    }

    @PostMapping("/interact")
    public OrderRecord interact() {
        return domainUseCase.doUseCaseLogic();
    }
}
