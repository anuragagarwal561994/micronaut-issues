# Micronaut Maven Issue [1481](https://github.com/micronaut-projects/micronaut-maven-plugin/issues/1481)

This is a multi-module project that doesn't build with the 4.11.2 version of the plugin.

## Building and Running

```bash
# Build native image
mvn clean package -pl issue-1481/module-b -am -Dpackaging=docker
```