package com.example

import com.example.model.Bestellung
import com.example.model.Preis
import io.micronaut.context.annotation.InjectScope
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject

@Controller("/bestellung")
class BestellungController {

    @Inject
    var preisClient: PreisClient? = null

    @Post(uri="/")
    fun bestellen( bestellung: Bestellung): Preis {
        var total = 0.0
        bestellung.positionen.forEach {
            total += preisClient!!.bestellen(it.artikel).preis * it.menge
        }
        return Preis(total)
    }
}