package com.kotlin_solid_examples.services.srp.correct

import com.kotlin_solid_examples.models.Customer
import com.kotlin_solid_examples.models.User

interface UserCustomerAssociationService {
    fun setCustomer(user: User, customer: Customer): User
    fun removeCustomer(user: User): User
}