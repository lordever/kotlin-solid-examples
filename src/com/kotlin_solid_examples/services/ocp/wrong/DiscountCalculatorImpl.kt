package com.kotlin_solid_examples.services.ocp.wrong

class DiscountCalculatorImpl : DiscountCalculator {
    override fun calculateDiscountBasedOnUserType(userType: String): Double {
        return when (userType) {
            "VIP" -> 0.2
            "Regular" -> 0.1
            "Premium" -> 0.3
            "Gold" -> 0.4
            "Silver" -> 0.15
            else -> 0.0
        }
    }
}