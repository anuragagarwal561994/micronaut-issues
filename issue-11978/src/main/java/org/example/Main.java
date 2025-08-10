package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.context.ApplicationContext;
import io.micronaut.core.io.ResourceLoader;
import jakarta.inject.Singleton;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Singleton
@RequiredArgsConstructor
public class Main {
    private final ObjectMapper objectMapper;
    private final ResourceLoader resourceLoader;

    public static void main(String[] args) {
        try (var context = ApplicationContext.run()) {
            context.getBean(Main.class).doSomething();
        }
    }

    @SneakyThrows(IOException.class)
    public void doSomething() {
        var resource = resourceLoader.getResource("bar.json");
        if (resource.isPresent()) {
            log.info("{}", objectMapper.readValue(resource.get(), Bar.class));
        }
    }
}
