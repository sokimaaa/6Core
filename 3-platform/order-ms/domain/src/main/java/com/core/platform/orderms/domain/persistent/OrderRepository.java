package com.core.platform.orderms.domain.persistent;

import com.core.platform.orderms.domain.model.OrderRecord;

public interface OrderRepository {
    OrderRecord get();

    OrderRecord save(final OrderRecord domainObject);
}
