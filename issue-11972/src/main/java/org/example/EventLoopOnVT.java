package org.example;

import io.micronaut.context.annotation.DefaultImplementation;
import jakarta.inject.Singleton;

@Singleton
@DefaultImplementation
class EventLoopOnVT implements EventLoop {
}
