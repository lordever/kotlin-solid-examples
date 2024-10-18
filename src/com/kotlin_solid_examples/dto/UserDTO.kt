package com.kotlin_solid_examples.dto

import com.kotlin_solid_examples.models.Customer

data class UserDTO(
    var name: String? = null,
    var email: String? = null,
    var customer: Customer? = null
)