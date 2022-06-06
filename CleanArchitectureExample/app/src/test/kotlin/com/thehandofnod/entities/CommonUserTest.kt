package com.thehandofnod.entities

import com.thehandofnod.entities.impl.CommonUser
import kotlin.test.Test
import kotlin.test.assertFalse

class CommonUserTest {
    @Test fun `test given 123 Password when Password Is Not Valid then Is False`() {
        val user: User = CommonUser.CommonUserFactory.create("Novak Daniel", "123")
        assertFalse(user.passwordIsValid())
    }
}