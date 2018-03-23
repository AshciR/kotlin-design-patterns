package io.richie.factory

data class CheesePizza(val type: PizzaType = PizzaType.CHEESE) : Pizza {

    override fun prepare(): String = "Preparing Cheese Pizza"

    override fun bake(): String = "Baking Cheese Pizza"

    override fun cut(): String = "Cutting Cheese Pizza"

    override fun box(): String = "Boxing Cheese Pizza"

}