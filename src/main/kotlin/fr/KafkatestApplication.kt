package fr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkatestApplication

fun main(args: Array<String>) {
    runApplication<KafkatestApplication>(*args)
}
