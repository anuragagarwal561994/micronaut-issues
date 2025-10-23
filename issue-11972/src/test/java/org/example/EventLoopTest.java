package org.example;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.test.support.TestPropertyProvider;
import jakarta.inject.Inject;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@MicronautTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EventLoopTest implements TestPropertyProvider {
    @Inject
    private EventLoop eventLoop;

    @Test
    void testNoVt() {
        assertThrows(AssertionError.class, this::assertEventLoopInstance);
    }

    private void assertEventLoopInstance() {
        assertInstanceOf(EventLoopOnVT.class, eventLoop);
    }

    @Override
    public @NonNull Map<String, String> getProperties() {
        return Map.of("USE_VT", "false", "config.enabled", "false");
    }
}
