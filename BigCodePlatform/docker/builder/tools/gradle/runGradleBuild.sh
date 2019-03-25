#!/usr/bin/env sh

# This command is used to run gradle build process. 
# It must contains all required tasks (building, unit and integration testing) to build completed platform

./gradlew --console=plain \
         --no-daemon \
         --project-cache-dir=/app/workspace/.gradle/docker/builder/.gradle \
         --gradle-user-home=/app/workspace/.gradle/docker/builder/.gradle-cache \
         build
         
         