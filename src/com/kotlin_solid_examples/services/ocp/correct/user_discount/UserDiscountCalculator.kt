package com.kotlin_solid_examples.services.ocp.correct.user_discount

import com.kotlin_solid_examples.services.ocp.correct.discount.DiscountCalculator

fun interface UserDiscountCalculator {
    fun calculateDiscountBasedOnUserType(calculator: DiscountCalculator): Double
}