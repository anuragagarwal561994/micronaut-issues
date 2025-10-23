package org.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@ConfigurationProperties("config")
class Config {
    private boolean enabled;

    public boolean isEnabled() {
        log.info("Config.isEnabled");
        return enabled;
    }
}
