package org.example;

import io.micronaut.context.annotation.EachProperty;
import lombok.Data;

@Data
@EachProperty("fooBar")
class NotWorkingConfiguration {
    private int expectedSize;
    private double fpp;
}
