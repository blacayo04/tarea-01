package Curso2

import java.text.DecimalFormat

fun main(){
    val resultado = 10.0 / 3.0

    val formato = DecimalFormat("#.00")

    println(Math.round(resultado))
    println(formato.format(resultado))
}