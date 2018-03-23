package io.richie.factory

data class VeggiePizza(val type: PizzaType = PizzaType.VEGGIE) : Pizza {
    override fun prepare(): String = "Preparing Veggie Pizza"

    override fun bake(): String = "Baking Veggie Pizza"

    override fun cut(): String = "Cutting Veggie Pizza"

    override fun box(): String = "Boxing Veggie Pizza"
}