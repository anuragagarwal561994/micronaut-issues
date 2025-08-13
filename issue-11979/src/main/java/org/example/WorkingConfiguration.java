package org.example;

import io.micronaut.context.annotation.EachProperty;
import lombok.Data;

@Data
@EachProperty("bar-foo")
class WorkingConfiguration {
    private int expectedSize;
    private double fpp;

    public static WorkingConfiguration of(int expectedSize, double fpp) {
        var workingConfiguration = new WorkingConfiguration();
        workingConfiguration.setExpectedSize(expectedSize);
        workingConfiguration.setFpp(fpp);
        return workingConfiguration;
    }
}
