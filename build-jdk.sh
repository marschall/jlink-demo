#!/bin/bash

set -e

PROJECT_VERSION=0.1.0-SNAPSHOT

jlink \
  --module-path ./fake-jdbc/target/fake-jdbc-${PROJECT_VERSION}.jar:./fake-jdbc-implementation/target/fake-jdbc-implementation-${PROJECT_VERSION}.jar:./fake-jdbc-user/target/fake-jdbc-user-${PROJECT_VERSION}.jar \
  --launcher gss_dependency=com.github.marschall.fakejdbc.user/com.github.marschall.sql.user.ConnectionBuilderUser \
  --add-modules com.github.marschall.fakejdbc.user \
  --output target
