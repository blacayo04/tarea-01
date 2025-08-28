package Curso2

val sesionIniciada = true
val edad7 = 70

fun main(){
    if (sesionIniciada == true){
        println("Bienvenido")
    } else {
        println("Inicia sesion")
    }

    //Otra forma
    if (sesionIniciada != true){
        println("Inicia Sesion")
    } else {
        println("Bienvenido")
    }

    //Otra forma
    if(sesionIniciada){
        println("Bienvenido")
    }else{
        println("Inicia sesion")
    }

    //comparacion
    if (edad7 < 18){
        println("Eres menor de edad")
    } else if(edad7 < 60){
        println("Mayor de edad")
    } else {
        println("Tercera edad")
    }
}





