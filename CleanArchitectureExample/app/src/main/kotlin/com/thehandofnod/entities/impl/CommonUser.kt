package com.thehandofnod.entities.impl

import com.thehandofnod.entities.User
import com.thehandofnod.entities.UserFactory

class CommonUser private constructor (@JvmField val name: String, @JvmField val password: String) : User {

    override fun passwordIsValid(): Boolean {
        return password != null && password.length > 5
    }

    override fun getName(): String {
        return name
    }

    override fun getPassword(): String {
        return password
    }

    companion object CommonUserFactory : UserFactory {
        override fun create(name: String, password: String): User {
            return CommonUser(name, password)
        }
    }
}