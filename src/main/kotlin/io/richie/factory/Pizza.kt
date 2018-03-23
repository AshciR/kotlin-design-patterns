package io.richie.factory

interface Pizza {
    fun prepare() : String
    fun bake() : String
    fun cut() : String
    fun box() : String
}