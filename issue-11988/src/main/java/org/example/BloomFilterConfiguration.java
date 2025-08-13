package org.example;

import lombok.Data;

@Data
class BloomFilterConfiguration {
    private int expectedSize;
    private double fpp;
}
