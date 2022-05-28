package com.example

import java.lang.RuntimeException

class NoPriceAvailableException (override val message: String? = "There is no price for this article ", artikel: String ) : RuntimeException(message + artikel)