package com.core.platform.orderms.app;

import com.core.platform.orderms.domain.persistent.OrderRepository;
import com.core.platform.orderms.domain.service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OrderUseCaseUnitTest {
    @InjectMocks OrderUseCase domainUseCase;

    @Mock OrderService domainService;

    @Mock OrderRepository domainObjectRepository;

    @Test
    void doUseCase_nonNullCase_True() {
        // some test case
    }

    @Test
    void doUseCase_nullCase_False() {
        // some test case
    }

    @Test
    void doUseCase_noParameters_Error() {
        // some test case
    }
}
