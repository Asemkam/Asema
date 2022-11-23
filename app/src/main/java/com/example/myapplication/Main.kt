package com.example.myapplication
import com.example.myapplication.Herbivores

fun main() {
    val animal1: Herbivores = Herbivores(nameOfAnimal = "beaver", colorOfAnimal = "brown")
    val animal2: Herbivores = Herbivores(nameOfAnimal = "elephant", colorOfAnimal = "grey")
    val animal3: Carnivores = Carnivores(nameOfAnimal = "puma", colorOfAnimal = "black")
    val animal4: Carnivores = Carnivores(nameOfAnimal = "lion", colorOfAnimal = "yellow")

    var listOfAnimal1:List<Herbivores> = listOf(animal1,animal2)
    var listOfAnimal2:List<Carnivores> = listOf(animal3,animal4)


    println(animal1.nameOfAnimal)
    println(animal2.nameOfAnimal)
    println(animal3.nameOfAnimal)
    println(animal4.nameOfAnimal)

}