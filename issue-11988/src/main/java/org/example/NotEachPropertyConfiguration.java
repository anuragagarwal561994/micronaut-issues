package org.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Data;

@Data
@ConfigurationProperties("baz")
class NotEachPropertyConfiguration {
    private NotEachPropertyBloomFilterConfiguration bloomFilterConfiguration;

    @ConfigurationProperties("bloomFilter")
    public static class NotEachPropertyBloomFilterConfiguration extends BloomFilterConfiguration {
    }
}
