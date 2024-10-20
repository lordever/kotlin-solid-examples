package com.kotlin_solid_examples.services.ocp.correct.discount

class RegularDiscountCalculator : DiscountCalculator {
    override fun calculate(): Double {
        return 0.1
    }
}