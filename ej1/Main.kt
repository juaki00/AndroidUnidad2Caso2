package ej1

fun main() {
    val x = SerVivo(3)
    val y = SerVivo(5)
    println("El ser vivo mayor es ${x.mayor(y)}")
    val homer = Humano(34, "Homero")
    val bart = Humano(9, "Bart")
    println("El humano mayor es ${homer.mayor(bart)}")
}