package com.avila.project.examples

import io.github.oshai.kotlinlogging.KotlinLogging

private val logger = KotlinLogging.logger { }

private const val message = "world"

fun log() {

    logger.info { "hello $message" }

    try {

        // code

    } catch (exception: Exception) {

        logger.error(exception) {
            "the $exception occurred"
        }

    }

    fun testing() {

    }

}