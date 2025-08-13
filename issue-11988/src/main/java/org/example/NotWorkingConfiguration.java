package org.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.EachProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@EachProperty("foo")
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
class NotWorkingConfiguration {
    private NotWorkingBloomFilterConfiguration bloomFilterConfiguration;

    @ConfigurationProperties("bloomFilter")
    public static class NotWorkingBloomFilterConfiguration extends BloomFilterConfiguration {
    }
}
