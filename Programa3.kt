fun main(args: Array<String>){

    var operando1 : Float
    var operando2 : Float

    operando1 = 4.3f
    operando2 = 12.2f

    var resultado: Float = sumaFloat(operando1, operando2)
    println("La suma es igual a : "+ resultado)

    //Double
    var operando3: Double
    var operando4: Double

    //En double no es necesario poner la f de float
    operando3 = 5.5
    operando4 = 12.5

    var resultadoSuma: Double = SumaDouble(operando3, operando4)
    println("La suma de estos es igual a : " + resultadoSuma)
}

fun SumaDouble(operando3: Double, operando4: Double): Double {
    return operando3 + operando4
}

fun sumaFloat(operando1: Float, operando2: Float): Float {
    return operando1 + operando2
}
