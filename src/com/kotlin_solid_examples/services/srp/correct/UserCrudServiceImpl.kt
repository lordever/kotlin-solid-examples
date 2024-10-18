package com.kotlin_solid_examples.services.srp.correct

import com.kotlin_solid_examples.dto.UserDTO
import com.kotlin_solid_examples.models.User

class UserCrudServiceImpl : UserCrudService {
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

    override fun create(user: UserDTO) {
        println("User ${user.name} has been created")
    }

    override fun remove(id: Int) {
        println("User $id has been removed")
    }

    override fun update(user: UserDTO) {
        println("User ${user.name} has been updated")
    }
}