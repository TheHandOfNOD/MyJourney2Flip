package com.thehand.of.nod.application

import geb.Page

class LoginFailedPage extends Page {
    static at = { title == 'Login Failed' }

    static url = '/login/authFailed'
}
