package com.kotlin_solid_examples.services.ocp.wrong

import com.kotlin_solid_examples.models.UserType

class DiscountCalculatorImpl : DiscountCalculator {
    override fun calculateDiscountBasedOnUserType(userType: UserType): Double {
        return when (userType) {
            UserType.VIP -> 0.2
            UserType.REGULAR -> 0.1
            UserType.PREMIUM -> 0.3
            UserType.GOLD -> 0.4
            UserType.SILVER -> 0.15
        }
    }
}