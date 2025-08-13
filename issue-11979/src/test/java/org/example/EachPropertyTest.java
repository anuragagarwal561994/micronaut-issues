package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.util.List;
import org.junit.jupiter.api.Test;

@MicronautTest
class EachPropertyTest {
    @Inject
    private List<NotWorkingConfiguration> notWorkingConfigurations;

    @Inject
    private List<WorkingConfiguration> workingConfigurations;

    @Test
    void testWorkingConfigurationsIsNotEmpty() {
        assertFalse(workingConfigurations.isEmpty());
        var bean1 = WorkingConfiguration.of(1_000_000, 1e-3);
        var bean2 = WorkingConfiguration.of(8_000_000, 1e-9);
        assertEquals(List.of(bean1, bean2), workingConfigurations);
    }

    @Test
    void testNotWorkingConfigurations() {
        assertTrue(notWorkingConfigurations.isEmpty());
    }
}
