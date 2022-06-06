package com.example

import com.example.model.Preis
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client

@Client("preisservice")
interface PreisClient {

    @Get("/preis/{artikel}")
    fun bestellen(@PathVariable artikel: String) : Preis
}