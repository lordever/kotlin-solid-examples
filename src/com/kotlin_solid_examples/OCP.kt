package com.kotlin_solid_examples

import com.kotlin_solid_examples.models.UserType
import com.kotlin_solid_examples.services.ocp.correct.discount.*
import com.kotlin_solid_examples.services.ocp.correct.discount.factory.DiscountCalculatorFactory
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

    println("VIP user discount: ${overloadedDiscountCalculator.calculateDiscountBasedOnUserType(UserType.VIP)}")
    println("Regular user discount: ${overloadedDiscountCalculator.calculateDiscountBasedOnUserType(UserType.REGULAR)}")
    println("Premium user discount: ${overloadedDiscountCalculator.calculateDiscountBasedOnUserType(UserType.PREMIUM)}")
    println("Gold user discount: ${overloadedDiscountCalculator.calculateDiscountBasedOnUserType(UserType.GOLD)}")
    println("Silver user discount: ${overloadedDiscountCalculator.calculateDiscountBasedOnUserType(UserType.SILVER)}")

    /*--------------------------------------*/



    /*--------------------------------------*/
    //Correct approach with factory

    val discountCalculatorFactory = DiscountCalculatorFactory()

    discountCalculatorFactory.register(UserType.VIP, VIPDiscountCalculator())
    discountCalculatorFactory.register(UserType.REGULAR, RegularDiscountCalculator())
    discountCalculatorFactory.register(UserType.PREMIUM, PremiumDiscountCalculator())
    discountCalculatorFactory.register(UserType.GOLD, GoldDiscountCalculator())
    discountCalculatorFactory.register(UserType.SILVER, SilverDiscountCalculator())

    println("VIP user discount: ${discountCalculatorFactory.getDiscountCalculator(UserType.VIP)?.calculate()}")
    println("Regular user discount: ${discountCalculatorFactory.getDiscountCalculator(UserType.REGULAR)?.calculate()}")
    println("Premium user discount: ${discountCalculatorFactory.getDiscountCalculator(UserType.PREMIUM)?.calculate()}")
    println("Gold user discount: ${discountCalculatorFactory.getDiscountCalculator(UserType.GOLD)?.calculate()}")
    println("Silver user discount: ${discountCalculatorFactory.getDiscountCalculator(UserType.SILVER)?.calculate()}")
}