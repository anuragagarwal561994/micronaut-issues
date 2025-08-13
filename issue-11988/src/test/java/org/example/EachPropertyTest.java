package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.util.List;
import org.example.WorkingConfiguration.WorkingBloomFilterConfiguration;
import org.junit.jupiter.api.Test;

@MicronautTest
class EachPropertyTest {
    @Inject
    private List<WorkingConfiguration> workingConfigurations;

    @Inject
    private ApplicationContext beanContext;

    @Test
    void testWorkingConfigurationsIsNotEmpty() {
        assertFalse(workingConfigurations.isEmpty());
        var bean1 = WorkingConfiguration.of(WorkingBloomFilterConfiguration.of(1_000_000, 1e-3));
        var bean2 = WorkingConfiguration.of(WorkingBloomFilterConfiguration.of(8_000_000, 1e-9));
        assertEquals(2, workingConfigurations.size());
        assertTrue(workingConfigurations.contains(bean1));
        assertTrue(workingConfigurations.contains(bean2));
    }

    @Test
    void testNotWorkingConfigurationsIsEmpty() {
        assertThrows(
            Exception.class,
            () -> beanContext.getBeansOfType(NotWorkingConfiguration.class)
        );
    }
}
