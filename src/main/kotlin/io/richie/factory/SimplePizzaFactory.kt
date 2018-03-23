package io.richie.factory

// This the Kotlin version of the Pizza factory
// Notice that we didn't have to wrap this method within
// a class. So essentially, it behaves as a "static" java method
fun createPizza(type: PizzaType): Pizza = when(type){
    PizzaType.CHEESE -> CheesePizza()
    PizzaType.VEGGIE -> VeggiePizza()
}

// Holds the different types of pizzas
// The change is encapsulated within this file
// If a new type is added, then the only change will be here
enum class PizzaType { CHEESE, VEGGIE }
