package org.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@ConfigurationProperties("bazFooBar")
class NotEachPropertyConfiguration {
    private int expectedSize;
    private double fpp;
}
