package com.kotlin_solid_examples.models

data class User(
    var id: Int? = null,
    var name: String? = null,
    var email: String? = null,
    var type: String? = null,
    var customer: Customer? = null
)