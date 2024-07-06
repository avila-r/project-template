val kotlinVersion = "1.9.24"
val hikariVersion = "5.1.0"
val ktorVersion = "2.3.11"
val mainClass = "com.avila.{project}"
val kotlinResultVersion = "2.0.0"
val kotlinLoggingVersion = "5.1.0"
val jacksonVersion = "3.6.0"

/**
 * Plugins
 */
plugins {
    /**
     * Ktor
     */
        id("io.ktor.plugin") version "2.3.11"

    /**
     * Kotlin's plugins
     */
        // JVM support
        kotlin("jvm") version "1.9.24"
        // SerializationX Lib
        id("org.jetbrains.kotlin.plugin.serialization") version "1.9.24"
        // Shadow jar to include all dependencies at artifact
        id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.avila"
version = "0.1"

/**
 * Ktor Configuration
 */
application {
    mainClass.set(mainClass)
}

/**
 * Shadow Jar Configuration
 */
tasks.shadowJar {
    manifest {
        attributes["Main-Class"] = mainClass
    }
}

/**
 * Specifies the language version to use
 */
java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
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
 * Defines the repositories for dependency resolution.
 * Uses Maven Central repository to fetch dependencies.
 */
repositories {
    mavenCentral()
}


dependencies {

    /**
     * Utils
     */
        // Library for handling result types
        implementation("com.michael-bull.kotlin-result:kotlin-result:$kotlinResultVersion")

        // Library for logging
        implementation("io.github.oshai:kotlin-logging-jvm:$kotlinLoggingVersion")
        implementation("org.slf4j:slf4j-simple:2.0.0")

    /**
     * Ktor dependencies
     */
        // Core
        implementation("io.ktor:ktor-server-status-pages:$ktorVersion")
        implementation("io.ktor:ktor-server-core-jvm:$ktorVersion")
        implementation("io.ktor:ktor-server-netty-jvm:$ktorVersion")

        // Serialization
        implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$kotlinVersion")
        implementation("io.ktor:ktor-serialization-jackson-jvm:$ktorVersion")
        implementation("org.ktorm:ktorm-jackson:$jacksonVersion")

        /*
         * Database
         */
        implementation("org.postgresql:postgresql")
        implementation("com.zaxxer:HikariCP:$hikariVersion")

    /**
     * Tests
     */
        testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlinVersion")
        testImplementation("io.ktor:ktor-server-tests-jvm:$ktorVersion")
        testImplementation("io.ktor:ktor-server-test-host:$ktorVersion")

}
