package com.thehand.of.nod.domain.user.core.model.exception

data class InvalidEmailAddressException (val email: String) : Exception("Not a valid email address: $email ")