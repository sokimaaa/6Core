package com.core.platform.orderms.app;

import com.core.platform.orderms.domain.model.OrderRecord;
import com.core.platform.orderms.domain.persistent.OrderRepository;
import com.core.platform.orderms.domain.service.OrderService;

public final class OrderUseCase {
    private final OrderService service;
    private final OrderRepository repository;

    public OrderUseCase(final OrderService service, final OrderRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    public OrderRecord doUseCaseLogic() {
        System.out.println("Do use case logic!!");
        final OrderRecord domainObject = repository.get();
        return service.doDomainLogic(domainObject);
    }
}
