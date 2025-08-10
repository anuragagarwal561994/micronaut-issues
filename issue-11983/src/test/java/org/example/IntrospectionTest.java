package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.micronaut.core.beans.BeanIntrospection;
import java.util.Set;
import org.junit.jupiter.api.Test;

class IntrospectionTest {
    @Test
    void testBarAnnotationMetadata() {
        var introspection = BeanIntrospection.getIntrospection(Bar.class);
        var annotationMetadata = introspection.getAnnotationMetadata();
        var expected = Set.of(
            "io.micronaut.serde.annotation.Serdeable",
            "io.micronaut.core.annotation.Introspected"
        );
        assertEquals(expected, annotationMetadata.getAnnotationNames());
    }

    @Test
    void testBarBuilderAnnotationMetadata() {
        var introspection = BeanIntrospection.getIntrospection(Bar.BarBuilder.class);
        var annotationMetadata = introspection.getAnnotationMetadata();
        var expected = Set.of();
        assertEquals(expected, annotationMetadata.getAnnotationNames());
    }
}
