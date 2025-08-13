package org.example;

import io.micronaut.context.annotation.EachProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@EachProperty("bar-foo")
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
class WorkingConfiguration {
    private int expectedSize;
    private double fpp;
}
