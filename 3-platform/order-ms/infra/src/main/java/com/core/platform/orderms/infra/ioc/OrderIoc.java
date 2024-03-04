package com.core.platform.orderms.infra.ioc;

import com.core.platform.orderms.app.OrderUseCase;
import com.core.platform.orderms.domain.persistent.OrderRepository;
import com.core.platform.orderms.domain.service.OrderService;
import com.core.platform.orderms.domain.service.impl.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderIoc {

    @Bean
    public OrderUseCase domainUseCase(final OrderService domainService, final OrderRepository domainObjectRepository) {
        return new OrderUseCase(domainService, domainObjectRepository);
    }

    @Bean
    public OrderService domainService(final OrderRepository domainObjectRepository) {
        return new OrderServiceImpl(domainObjectRepository);
    }
}
