fun main(args: Array<String>){
    val llueve: Boolean = true
    val nublado: Boolean = true
    val haceFrio: Boolean = true

    // Or - Disyuncion
    if(llueve || haceFrio){
        println("No voy a salir a pasear ")
    }

    // and - conjuncion
    if(nublado && haceFrio){
        println("Seguramente llueva")
    }

    // NOT - negacion
    if(!llueve){
        println("No necesito el paraguas")
    }
}