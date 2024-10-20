package com.kotlin_solid_examples.services.ocp.correct.discount.factory

import com.kotlin_solid_examples.models.UserType
import com.kotlin_solid_examples.services.ocp.correct.discount.DiscountCalculator

class DiscountCalculatorFactory {
    private val discountCalculators = mutableMapOf<UserType, DiscountCalculator>()

    fun register(userType: UserType, discountCalculator: DiscountCalculator) {
        discountCalculators[userType] = discountCalculator
    }

    fun getDiscountCalculator(userType: UserType): DiscountCalculator? {
        return discountCalculators[userType]
    }
}