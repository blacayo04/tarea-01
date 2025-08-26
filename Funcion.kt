fun main (args: Array<String>){
    printHeader("Declarando funciones")
    var resultado = printFooter("Funcion con resultado")
    println(resultado)
}

//Asi se declara una funcion
fun printHeader(titulo: String){
    println("***************************")
    println("****** "+titulo+ " ********")
    println("***************************")
}

fun printFooter(titulo: String): String{
    var footer = "**********************\n"
    footer += titulo
    footer = footer + "\n****************"
    return footer
}