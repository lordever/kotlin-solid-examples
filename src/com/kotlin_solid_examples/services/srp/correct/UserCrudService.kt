package com.kotlin_solid_examples.services.srp.correct

import com.kotlin_solid_examples.dto.UserDTO
import com.kotlin_solid_examples.models.User

interface UserCrudService {
    fun getById(id: Int): User?
    fun getAll(): List<User>
    fun create(userDTO: UserDTO)
    fun remove(id: Int)
    fun update(id: Int, userDTO: UserDTO)
}