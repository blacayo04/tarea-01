package Curso2

import java.math.BigDecimal
import java.util.Date

fun main(){
    mostrarFecha()
    //println(BigDecimal(0.03).subtract(BigDecimal(0.02)))
    calcularImpuesto(BigDecimal(999), BigDecimal(16))
}

fun mostrarFecha(){
    println("-------------------------")
    println(Date())
    println("-------------------------")
}

fun calcularImpuesto(valor: BigDecimal, impuesto: BigDecimal){
    var resultado = valor.divide(BigDecimal(100))
    resultado =  resultado.multiply(impuesto)

    println(resultado)
}