package org.example;

import io.micronaut.context.annotation.EachProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@EachProperty("fooBar")
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
class NotWorkingConfiguration {
    private int expectedSize;
    private double fpp;
}
