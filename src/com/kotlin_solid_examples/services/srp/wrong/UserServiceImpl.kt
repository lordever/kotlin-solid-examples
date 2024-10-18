package com.kotlin_solid_examples.services.srp.wrong

import com.kotlin_solid_examples.models.Customer
import com.kotlin_solid_examples.models.User

class UserServiceImpl : UserService {
    companion object {
        private val user1 = User(1, "John Doe", "john.does@email.com")
        private val user2 = User(2, "Martha Johns", "martha.johns@email.com")
        private val user3 = User(3, "Bonny Murray", "bonny.murray@email.com")

        val users = listOf(user1, user2, user3)
    }

    override fun getById(id: Int): User? {
        return users.find { user: User -> user.id == id }
    }

    override fun getAll(): List<User> {
        return users
    }

    override fun create(user: User) {
        println("User ${user.name} has been created")
    }

    override fun remove(id: Int) {
        println("User $id has been removed")
    }

    override fun update(user: User) {
        println("User ${user.name} has been updated")
    }

    override fun signIn(username: String, password: String) {
        println("User with credentials has been signed in. Username: $username")
    }

    override fun signOut(user: User) {
        println("User ${user.name} has been signed out")
    }

    override fun setCustomer(user: User, customer: Customer): User {
        val updatedUser = User(
            id = user.id, name = user.name, customer = customer
        )

        return updatedUser
    }

    override fun removeCustomer(user: User): User {
        val updatedUser = User(
            id = user.id, name = user.name, customer = null
        )

        return updatedUser
    }
}