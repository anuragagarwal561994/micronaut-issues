package org.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.EachProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@EachProperty("bar")
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
class WorkingConfiguration {
    private WorkingBloomFilterConfiguration bloomFilterConfiguration;

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
