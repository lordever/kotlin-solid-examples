package com.kotlin_solid_examples.services.srp.correct

import com.kotlin_solid_examples.models.Customer
import com.kotlin_solid_examples.models.User

class UserCustomerAssociationServiceImpl : UserCustomerAssociationService {
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