package com.kotlin_solid_examples.services.ocp.correct.user_discount

import com.kotlin_solid_examples.services.ocp.correct.discount.DiscountCalculator

class UserDiscountCalculatorImpl : UserDiscountCalculator {
    override fun calculateDiscountBasedOnUserType(calculator: DiscountCalculator): Double {
        return calculator.calculate()
    }
}