package com.mbazhlek.ufosightings

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class UfoSightingsApplication

fun main(args: Array<String>) {
    runApplication<UfoSightingsApplication>(*args)
}

@RestController
class MainController {
    @GetMapping
    fun index() = "Hello, World!"
}