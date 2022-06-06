package com.thehandofnod.entities

interface UserFactory {
    fun create(name: String, password: String): User
}