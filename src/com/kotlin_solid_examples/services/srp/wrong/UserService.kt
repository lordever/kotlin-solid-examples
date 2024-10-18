package com.kotlin_solid_examples.services.srp.wrong

import com.kotlin_solid_examples.models.Customer
import com.kotlin_solid_examples.models.User

interface UserService {
    fun getById(id: Int): User?
    fun getAll(): List<User>
    fun create(user: User)
    fun remove(id: Int)
    fun update(user: User)
    fun signIn(username: String, password: String)
    fun signOut(user: User)
    fun setCustomer(user: User, customer: Customer): User
    fun removeCustomer(user: User): User
}