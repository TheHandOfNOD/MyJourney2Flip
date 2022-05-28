package com.example

import com.example.model.Bestellung
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Post

@Controller("/bestellung")
class BestellungController {

    @Post(uri="/")
    fun bestellen( bestellung: Bestellung): String {
        bestellung.positionen.forEach {
            print(it)
        }
        return "OK"
    }
}