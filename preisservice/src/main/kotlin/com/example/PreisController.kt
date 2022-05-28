package com.example

import com.example.model.Preis
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import jakarta.inject.Inject

@Controller("/preis")
class PreisController {

    @Inject
    val preisService: PreisService = PreisService()

    @Get(uri = "/{artikel}")
    fun getPrice(@PathVariable artikel: String): Preis {
        return preisService.getPrice(artikel)
    }

}