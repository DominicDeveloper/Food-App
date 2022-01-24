package com.dominic.makefood.Model

class Food {
    var name:String? = null
    var ingredient:String? = null
    var makeFood:String? = null

    constructor(name: String?, ingredient: String?, makeFood: String?) {
        this.name = name
        this.ingredient = ingredient
        this.makeFood = makeFood
    }
}