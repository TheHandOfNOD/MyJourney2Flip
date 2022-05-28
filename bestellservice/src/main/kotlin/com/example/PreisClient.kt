package com.example

import com.example.model.Preis
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client

@Client("http://localhost:8081")
interface PreisClient {

    @Get("/preis/{artikel}")
    fun bestellen(@PathVariable artikel: String) : Preis
}