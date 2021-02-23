# Project Artifact Dependencies

## End Section 10

```
runtimeClasspath - Runtime classpath of source set 'main'.
+--- org.springframework:spring-webmvc:4.0.3.RELEASE
|    +--- org.springframework:spring-beans:4.0.3.RELEASE
|    |    \--- org.springframework:spring-core:4.0.3.RELEASE
|    |         \--- commons-logging:commons-logging:1.1.3
|    +--- org.springframework:spring-context:4.0.3.RELEASE
|    |    +--- org.springframework:spring-aop:4.0.3.RELEASE
|    |    |    +--- aopalliance:aopalliance:1.0
|    |    |    +--- org.springframework:spring-beans:4.0.3.RELEASE (*)
|    |    |    \--- org.springframework:spring-core:4.0.3.RELEASE (*)
|    |    +--- org.springframework:spring-beans:4.0.3.RELEASE (*)
|    |    +--- org.springframework:spring-core:4.0.3.RELEASE (*)
|    |    \--- org.springframework:spring-expression:4.0.3.RELEASE
|    |         \--- org.springframework:spring-core:4.0.3.RELEASE (*)
|    +--- org.springframework:spring-core:4.0.3.RELEASE (*)
|    +--- org.springframework:spring-expression:4.0.3.RELEASE (*)
|    \--- org.springframework:spring-web:4.0.3.RELEASE
|         +--- org.springframework:spring-aop:4.0.3.RELEASE (*)
|         +--- org.springframework:spring-beans:4.0.3.RELEASE (*)
|         +--- org.springframework:spring-context:4.0.3.RELEASE (*)
|         \--- org.springframework:spring-core:4.0.3.RELEASE (*)
+--- javax.inject:javax.inject:1
+--- org.apache.commons:commons-math3:3.2
+--- jstl:jstl:1.2
\--- log4j:log4j:1.2.17
```

## End Section 11

```
runtimeClasspath - Runtime classpath of source set 'main'.
+--- jstl:jstl:1.2
+--- javax.inject:javax.inject:1
+--- org.apache.commons:commons-math3:3.2
+--- org.springframework:spring-webmvc:4.0.3.RELEASE
|    +--- org.springframework:spring-beans:4.0.3.RELEASE
|    |    \--- org.springframework:spring-core:4.0.3.RELEASE
|    +--- org.springframework:spring-context:4.0.3.RELEASE
|    |    +--- org.springframework:spring-aop:4.0.3.RELEASE
|    |    |    +--- aopalliance:aopalliance:1.0
|    |    |    +--- org.springframework:spring-beans:4.0.3.RELEASE (*)
|    |    |    \--- org.springframework:spring-core:4.0.3.RELEASE
|    |    +--- org.springframework:spring-beans:4.0.3.RELEASE (*)
|    |    +--- org.springframework:spring-core:4.0.3.RELEASE
|    |    \--- org.springframework:spring-expression:4.0.3.RELEASE
|    |         \--- org.springframework:spring-core:4.0.3.RELEASE
|    +--- org.springframework:spring-core:4.0.3.RELEASE
|    +--- org.springframework:spring-expression:4.0.3.RELEASE (*)
|    \--- org.springframework:spring-web:4.0.3.RELEASE
|         +--- org.springframework:spring-aop:4.0.3.RELEASE (*)
|         +--- org.springframework:spring-beans:4.0.3.RELEASE (*)
|         +--- org.springframework:spring-context:4.0.3.RELEASE (*)
|         \--- org.springframework:spring-core:4.0.3.RELEASE
+--- org.slf4j:jcl-over-slf4j:1.7.25
|    \--- org.slf4j:slf4j-api:1.7.25
\--- org.slf4j:slf4j-log4j12:1.7.25
     +--- org.slf4j:slf4j-api:1.7.25
     \--- log4j:log4j:1.2.17
```