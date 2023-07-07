package fr.kafkatest

import fr.KafkatestApplication
import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestKafkatestApplication

fun main(args: Array<String>) {
    fromApplication<KafkatestApplication>().with(TestKafkatestApplication::class).run(*args)
}
