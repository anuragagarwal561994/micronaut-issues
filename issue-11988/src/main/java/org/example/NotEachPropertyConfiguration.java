package org.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ConfigurationProperties("baz")
@AllArgsConstructor(staticName = "of")
class NotEachPropertyConfiguration {
    private NotEachPropertyBloomFilterConfiguration bloomFilterConfiguration;

    @ConfigurationProperties("bloomFilter")
    public static class NotEachPropertyBloomFilterConfiguration extends BloomFilterConfiguration {
    }
}
