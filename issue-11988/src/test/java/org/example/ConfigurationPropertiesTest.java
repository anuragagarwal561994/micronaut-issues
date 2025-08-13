package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
class ConfigurationPropertiesTest {
    @Inject
    private NotEachPropertyConfiguration notEachPropertyConfiguration;

    @Test
    void testConfigLoaded() {
        var bloomFilterConfiguration = notEachPropertyConfiguration.getBloomFilterConfiguration();
        assertEquals(7_000_000, bloomFilterConfiguration.getExpectedSize());
        assertEquals(1e-7, bloomFilterConfiguration.getFpp());
    }
}
