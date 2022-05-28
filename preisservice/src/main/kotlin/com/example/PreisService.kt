package com.example

import com.example.model.Preis
import jakarta.inject.Singleton
import java.lang.RuntimeException

@Singleton
class PreisService {
    fun getPrice(artikel: String): Preis {
        println("Calculating price for " + artikel)

        when (artikel) {
            "Kaffee" -> return Preis(2.40)
            "Tee" -> return Preis(1.20)
            "Wasser" -> return Preis (0.50)
            else -> TODO("should be a custom exception")
        }
    }
}