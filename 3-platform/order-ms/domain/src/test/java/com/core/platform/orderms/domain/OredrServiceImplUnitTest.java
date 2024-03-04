package com.core.platform.orderms.domain;

import com.core.platform.orderms.domain.persistent.OrderRepository;
import com.core.platform.orderms.domain.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OredrServiceImplUnitTest {
    @InjectMocks OrderServiceImpl domainServiceImpl;

    @Mock OrderRepository domainObjectRepository;

    @Test
    void doDomainLogic_nonNullCase_True() {
        // some test case
    }

    @Test
    void doDomainLogic_nullCase_True() {
        // some test case
    }

    @Test
    void doDomainLogic_noParameters_Error() {
        // some test case
    }
}