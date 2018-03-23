package io.richie

import io.richie.factory.PizzaStore
import io.richie.factory.PizzaType

fun main(args: Array<String>) {

    // Let's test out the Pizza Store
    val pizzaStore = PizzaStore()

    // And we'll order some pizzas
    pizzaStore.orderPizza(PizzaType.CHEESE)
    pizzaStore.orderPizza(PizzaType.VEGGIE)
}

