fun main (args: Array<String>){
    val name1 = "Maria"
    val name2 = "Juan"

    //Invocamos al metodo 1
    getLongestName(name1, name2)

    //Invocamos al metodo 2
    getLongestName2(name1, name2)

    //Invocamos al metodo 3
    getLongestName3(name1, name2)
}

fun getLongestName3(name1: String, name2: String) {
    val longestName = if(name1.length > name2.length){
        println("El nombre mas largo es: $name1")
        name1
    }else{
        println("El nombre mas largo es: $name2")
        name2
    }

    println("LongestName = $longestName")
}

fun getLongestName(name1: String, name2: String){
    var longestName = name2
    if(name1.length > name2.length) longestName = name1

    println("El nombre mas largo es: $longestName")
}

fun getLongestName2(name1: String, name2: String){
    var longestName = ""
    if(name1.length > name2.length){
        longestName = name1
    } else {
        longestName = name2
    }

    println("El nombre mas largo es: $longestName")
}