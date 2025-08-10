package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Serdeable
@Jacksonized
public class Bar {
    @JsonProperty("name")
    String name;

    @JsonProperty("age")
    Integer age;
}
