fun main (args: Array<String>){
    val password = "asdasdasdasd"

    when (password.length){
        0 -> println("Contraseña vacia")
        in 1..4 -> println("Contraseña muy debil")
        in 5..6-> println("Contraseña segura")
        else -> println("Contraseña segura")
    }
    esPar(215431)
}


fun esPar(numero: Int ) = when(numero % 2 ){
    0 -> println("El numero es par")
    else -> println("El numero es impar")
}