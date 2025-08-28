package Curso2

val nombre = "Juan"
val edad = 25

val nombre1 = "Pedro"
val edad1 = 23
val dinero = 25.50

fun main(){
    val resultado = "Su nombre es: " + nombre + " tiene la edad de: "+ edad + " años "
    println(resultado)

    //Segunda forma
    val resultado2 = "Su nombre es: $nombre1 y tiene la edad de $edad1"
    println(resultado2)

    //Maximo valor
    println("El valor maximo de int es: ${Int.MAX_VALUE}")

    println("El valor maximo de int es: $dinero")

    //Trim
    val ruta =
        """
            nombre: $nombre
            edad:   $edad
        """.trimIndent()
    println(ruta)

}
