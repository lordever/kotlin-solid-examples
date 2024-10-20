package com.kotlin_solid_examples.services.ocp.correct.discount

class VIPDiscountCalculator : DiscountCalculator {
    override fun calculate(): Double {
        return 0.2
    }
}