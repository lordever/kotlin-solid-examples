package com.kotlin_solid_examples.services.ocp.wrong

import com.kotlin_solid_examples.models.UserType

fun interface DiscountCalculator {
    fun calculateDiscountBasedOnUserType(userType: UserType): Double
}