val springBootVersion = "3.3.1"
val kotlinVersion = "1.9.24"
val kotlinResultVersion = "2.0.0"
val kotlinLoggingVersion = "5.1.0"

group = "com.avila"
version = "0.1"

/**
 * Plugins
 */
plugins {

    /**
     * Kotlin's plugins
     */
//       // JPA support for generating no-args constructor at compiled bytecode
//       kotlin("plugin.jpa") version /* Kotlin version */  "1.9.24"

    // JVM support
    kotlin("jvm") version /* Kotlin version */ "1.9.24"

    // Spring support
    kotlin("plugin.spring") version /* Kotlin version */  "1.9.24"

//    /**
//     * Spring Boot plugins for application management
//     */
//        id("org.springframework.boot") version "3.3.1"
//        id("io.spring.dependency-management") version "1.1.5"


}

/**
 * Specifies the language version to use
 */
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

/**
 * Defines the repositories for dependency resolution.
 * Uses Maven Central repository to fetch dependencies.
 */
repositories {
    mavenCentral()
}

/**
 * Required dependencies
 *
 * - 'implementation': Specifies dependencies for the main source set.
 * - 'runtimeOnly': Specifies dependencies that are only needed at runtime.
 *
 * - 'testImplementation': Specifies dependencies for the test source set.
 * - 'testRuntimeOnly': Specifies dependencies that are only needed at runtime for testing.
 */
dependencies {

    /**
     * Spring support
     */
//        // Jackson support
//        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//        // Reflection support
//        implementation("org.jetbrains.kotlin:kotlin-reflect")

    /**
     * Utils
     */
        // Library for handling result types
        implementation("com.michael-bull.kotlin-result:kotlin-result:$kotlinResultVersion")

        // Library for logging
        implementation("io.github.oshai:kotlin-logging-jvm:$kotlinLoggingVersion")
        implementation("org.slf4j:slf4j-simple:2.0.0")

    /**
     * Datasource
     */
//        // PostgreSQL
//        runtimeOnly("org.postgresql:postgresql")

    /**
     * Docs
     */
//        // Springdoc OpenAPI for API auto-generated documentation
//        implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.5.0")

    /**
     * Spring Boot starters
     */
//        // Spring Actuator:
//        implementation("org.springframework.boot:spring-boot-starter-actuator")
//        // Spring Data JPA:
//        implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//        // Spring Web:
//        implementation("org.springframework.boot:spring-boot-starter-web")
//        // Spring for RabbitMQ:
//        implementation("org.springframework.boot:spring-boot-starter-amqp")


    /**
     * Tests
     */
//        // Spring Boot-related tests, including application context and other features
//        testImplementation("org.springframework.boot:spring-boot-starter-test")
//
//        // JUnit support
//        testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
//        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
//
//        // AssertJ for improving assertions
//        testImplementation("org.assertj:assertj-core")
//
//        // Mockito for mocking dependencies
//        testImplementation("org.mockito:mockito-core")
//
//        // H2 as testing-purpose datasource
//        testRuntimeOnly("com.h2database:h2")
}

/**
 * Kotlin Compiler Configuration
 */
kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

/**
 * Test's tasks configuration
 */
//tasks.withType<Test> {
//    // Use JUnit 5 platform for testing
//    useJUnitPlatform()
//}
