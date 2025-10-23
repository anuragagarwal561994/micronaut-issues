# Micronaut Issue [11972](https://github.com/micronaut-projects/micronaut-core/issues/11972)

## Building and Running

```bash
# Build native image
mvn clean test -pl issue-11972 -am
```

The test case fails, hence wrapped with `assertThrows(AssertionError.class, this::assertEventLoopInstance)`