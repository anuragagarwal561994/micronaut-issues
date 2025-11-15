package org.example;

import io.micronaut.runtime.Micronaut;

public class Main {
    public static void main(String[] args) {
        try (var context = Micronaut.run(Main.class, args)) {
            var bean = context.createBean(A.class);
            bean.start();
            bean.stop();
        }
    }
}
