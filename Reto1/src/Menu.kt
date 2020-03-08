
    fun main(args: Array<String>) {
        val menuRecetas : String = """
   		Selecciona la opción deseada:
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir"""
        println(menuRecetas)

        var option: String? = readLine()

        while (option != "3") {
            when (option) {
                "1" -> println("Has seleccionado Hacer una receta")
                "2" -> println("Has seleccionado Ver mis recetas")
                else -> println("La opcion ingresada no es válida")
            }
            option = readLine()
        }
        println("Has seleccionado Salir")
    }
