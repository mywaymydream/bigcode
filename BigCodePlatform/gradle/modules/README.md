Modules
==========

This folder contains reusable gradle configuration for particular module types.
To use this configuration it must be applied inside subproject module

For example:

```groovy
    apply from:"${project.rootDir}/gradle/modules/java-module.gradle"
```

# Reusable Modules

1. **[java-module](./java-module.gradle)** - generic java library packed into jar file
2. **[java-springboot-web-application-module.gradle](./java-springboot-web-application-module.gradle)** - spring boot standalone web application packed into jar file with all dependecies inside (uber jar)