package com.thehand.of.nod.domain.user.core.model

import com.thehand.of.nod.domain.user.core.model.exception.InvalidEmailAddressException
import java.util.regex.Pattern


class EmailAddress(val email: String) {

    companion object {
        val PATTERN = Pattern.compile("^(.+)@(.+)$")
    }

    fun validateEmailAddress() {
        val matcher = PATTERN.matcher(email)
        if (!matcher.matches()) {
            throw InvalidEmailAddressException(email)
        }
    }
}