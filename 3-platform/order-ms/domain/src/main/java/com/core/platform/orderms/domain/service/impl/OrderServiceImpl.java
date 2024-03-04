package com.core.platform.orderms.domain.service.impl;

import com.core.platform.orderms.domain.model.OrderRecord;
import com.core.platform.orderms.domain.persistent.OrderRepository;
import com.core.platform.orderms.domain.service.OrderService;

public final class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;

    public OrderServiceImpl(final OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public OrderRecord doDomainLogic(final OrderRecord domainObject) {
        System.out.println("Do domain logic!!");
        return repository.save(domainObject);
    }
}
