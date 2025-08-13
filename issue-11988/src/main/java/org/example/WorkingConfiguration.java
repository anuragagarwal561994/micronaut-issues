package org.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.EachProperty;
import lombok.Data;

@Data
@EachProperty("bar")
class WorkingConfiguration {
    private WorkingBloomFilterConfiguration bloomFilterConfiguration;

    public static WorkingConfiguration of(WorkingBloomFilterConfiguration bfConfiguration) {
        var workingConfiguration = new WorkingConfiguration();
        workingConfiguration.setBloomFilterConfiguration(bfConfiguration);
        return workingConfiguration;
    }

    @ConfigurationProperties("bloom-filter")
    public static class WorkingBloomFilterConfiguration extends BloomFilterConfiguration {
        public static WorkingBloomFilterConfiguration of(int expectedSize, double fpp) {
            var bloomFilterConfiguration = new WorkingBloomFilterConfiguration();
            bloomFilterConfiguration.setExpectedSize(expectedSize);
            bloomFilterConfiguration.setFpp(fpp);
            return bloomFilterConfiguration;
        }
    }
}
