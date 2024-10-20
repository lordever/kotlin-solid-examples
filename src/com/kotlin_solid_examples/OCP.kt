package com.kotlin_solid_examples

import com.kotlin_solid_examples.services.ocp.correct.discount.*
import com.kotlin_solid_examples.services.ocp.wrong.DiscountCalculatorImpl

fun main() {

    /**
     * The Open/Closed Principle (OCP) states that software
     * entities (classes, modules, functions) should be open
     * for extension but closed for modification, meaning you
     * can add new functionality without altering existing code.
     */

    /*--------------------------------------*/
    //Wrong approach

    val overloadedDiscountCalculator = DiscountCalculatorImpl()

    println("VIP user discount: ${overloadedDiscountCalculator.calculateDiscountBasedOnUserType("VIP")}")
    println("Regular user discount: ${overloadedDiscountCalculator.calculateDiscountBasedOnUserType("Regular")}")
    println("Premium user discount: ${overloadedDiscountCalculator.calculateDiscountBasedOnUserType("Premium")}")
    println("Gold user discount: ${overloadedDiscountCalculator.calculateDiscountBasedOnUserType("Gold")}")
    println("Silver user discount: ${overloadedDiscountCalculator.calculateDiscountBasedOnUserType("Silver")}")

    /*--------------------------------------*/
    //Correct approach

    val vipDiscount = VIPDiscountCalculator()
    val goldDiscount = GoldDiscountCalculator()
    val premiumDiscount = PremiumDiscountCalculator()
    val regularDiscount = RegularDiscountCalculator()
    val silverDiscount = SilverDiscountCalculator()


}