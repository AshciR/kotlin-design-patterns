package io.richie.factory

class PizzaStore(){
    fun orderPizza(type : PizzaType) : Pizza {

        // This is a pizza factory
        val pizza = createPizza(type)
        println("Created a $type Pizza")

        // The extension function apply() helps to
        // group and centralize initialization code for an object.
        pizza.apply {
            prepare()
            bake()
            cut()
            box()
        }

        println("$type pizza ready for delivery")
        return pizza
    }
}