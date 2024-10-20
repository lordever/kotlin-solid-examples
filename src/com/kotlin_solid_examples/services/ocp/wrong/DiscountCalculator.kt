package com.kotlin_solid_examples.services.ocp.wrong

fun interface DiscountCalculator {
    fun calculateDiscountBasedOnUserType(userType: String): Double
}