package com.kotlin_solid_examples.services.srp.correct

import com.kotlin_solid_examples.dto.UserDTO
import com.kotlin_solid_examples.models.User

class UserAuthServiceImpl : UserAuthService {
    override fun signIn(username: String, password: String) {
        println("User with credentials has been signed in. Username: $username")
    }

    override fun signOut(user: UserDTO) {
        println("User ${user.name} has been signed out")
    }
}