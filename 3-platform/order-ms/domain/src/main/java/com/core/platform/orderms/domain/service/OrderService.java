package com.core.platform.orderms.domain.service;

import com.core.platform.orderms.domain.model.OrderRecord;

public interface OrderService {
    OrderRecord doDomainLogic(final OrderRecord domainObject);
}
