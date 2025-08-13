package org.example;

import io.micronaut.context.annotation.EachProperty;
import lombok.Data;

@Data
@EachProperty("fooBar")
public class NotWorkingConfiguration {
    private int expectedSize;
    private double fpp;
}
