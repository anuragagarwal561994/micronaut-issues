package org.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Data;

@Data
@ConfigurationProperties("bazFooBar")
class NotEachPropertyConfiguration {
    private int expectedSize;
    private double fpp;
}
