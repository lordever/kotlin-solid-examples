package com.kotlin_solid_examples.services.srp.correct

import com.kotlin_solid_examples.models.User

interface UserAuthService {
    fun signIn(username: String, password: String)
    fun signOut(user: User)
}