package com.core.platform.orderms.infra.adapter.out;

import com.core.platform.orderms.domain.model.OrderRecord;
import com.core.platform.orderms.domain.persistent.OrderRepository;
import org.springframework.stereotype.Repository;

@Repository
public final class OrderPersistentDrivenAdapter implements OrderRepository {
    @Override
    public OrderRecord get() {
        // some communication with database
        return new OrderRecord();
    }

    @Override
    public OrderRecord save(final OrderRecord domainObject) {
        // some communication with database
        return domainObject;
    }
}
