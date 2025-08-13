package org.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.EachProperty;
import lombok.Data;

@Data
@EachProperty("foo")
class NotWorkingConfiguration {
    private NotWorkingBloomFilterConfiguration bloomFilterConfiguration;

    @ConfigurationProperties("bloomFilter")
    public static class NotWorkingBloomFilterConfiguration extends BloomFilterConfiguration {
    }
}
