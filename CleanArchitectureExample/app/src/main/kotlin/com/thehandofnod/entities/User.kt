package com.thehandofnod.entities

interface User {
    fun passwordIsValid(): Boolean
    fun getName(): String
    fun getPassword(): String
}