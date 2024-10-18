package com.kotlin_solid_examples

import com.kotlin_solid_examples.dto.UserDTO
import com.kotlin_solid_examples.models.Customer
import com.kotlin_solid_examples.models.User
import com.kotlin_solid_examples.services.srp.correct.UserAuthServiceImpl
import com.kotlin_solid_examples.services.srp.correct.UserCrudServiceImpl
import com.kotlin_solid_examples.services.srp.correct.UserCustomerAssociationServiceImpl
import com.kotlin_solid_examples.services.srp.wrong.UserServiceImpl

fun main() {
    /**
     * The Single Responsibility Principle (SRP) states that
     * every class or module should have only one reason to
     * change, meaning it should perform one specific task
     * or be responsible for a single part of the system's
     * functionality.
     */

    val user = User(1, "John Doe", "john.doe@email.com")
    val updatedUser = User(1, "Debian Gale", "debian.gale@email.com")
    val customer = Customer(1, "John Doe Customer Acc")

    /*--------------------------------------*/

    //Wrong
    val userService = UserServiceImpl()

    //CRUD
    println(userService.getById(1))
    println(userService.getAll())
    userService.create(user)
    userService.update(2, updatedUser)
    userService.remove(1)

    //Customer associations
    println(userService.setCustomer(user, customer))
    println(userService.removeCustomer(user))

    //User Authorization
    userService.signIn("JohnDoe", "Query1234")
    userService.signOut(user)

    /*--------------------------------------*/

    //Correct
    val userDTO = UserDTO("Debian Gale", "debian.gale@email.com")

    val userCrudService = UserCrudServiceImpl()
    val userAuthService = UserAuthServiceImpl()
    val userCustomerAssociationService = UserCustomerAssociationServiceImpl()

    //CRUD
    println(userCrudService.getById(1))
    println(userCrudService.getAll())

    userCrudService.create(userDTO)
    userCrudService.update(1, userDTO)
    userCrudService.remove(1)

    //Customer associations
    println(userCustomerAssociationService.setCustomer(user, customer))
    println(userCustomerAssociationService.removeCustomer(user))

    //User Authorization
    userAuthService.signIn("JohnDoe", "Query1234")
    userAuthService.signOut(user)

    /*--------------------------------------*/
}