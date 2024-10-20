package com.kotlin_solid_examples.services.ocp.correct.discount

class GoldDiscountCalculator: DiscountCalculator {
    override fun calculate(): Double {
        return 0.4
    }
}