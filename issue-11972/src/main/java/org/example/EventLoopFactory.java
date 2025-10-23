package org.example;

import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import jakarta.inject.Singleton;

@Factory
class EventLoopFactory {
    @Singleton
    @Requires(property = "USE_VT", value = "false")
    @Requires(bean = Config.class, beanProperty = "enabled", value = "true")
    EventLoop nettyLoop() {
        return new EventLoopOnNetty();
    }
}