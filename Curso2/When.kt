package Curso2

val edad8 = 60
val nombre2 = "Maria"

fun main(){
    val variable: Any = 10.0

    when{
        edad8 < 18 -> println("Menor de edad")
        edad8 < 60 -> println("Mayor de edad")
        else -> println("Tercera edad")
    }

    //Otra forma

    when (edad8) {
        in 1..17 -> println("Menor de edad")
        in 10..59 -> println("Mayor de edad")
        in 60..120 -> println("Tercera edad")
        else -> println("Incorrecto")
    }

    when (nombre2){
        "Juan", "Alejandro" -> println("Nombre")
        "Maria" -> println("Mujer")
        else -> println("No esta en la lista")
    }

    when (variable){
        is Int -> println("Entero")
        is String -> println("Texto")
        is Double -> println("Double")
    }
}