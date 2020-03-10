
    fun main(args: Array<String>) {
        val menuRecetas: String = """
   		Selecciona la opción deseada:
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir"""
        println(menuRecetas)

        var option: String? = readLine()

        while (option != "3") {
            when (option) {
                "1" -> {
                    println("Has seleccionado Hacer recetas ${makeRecipe()}")
                }
                "2" -> println("Has seleccionado Ver mis recetas")

                    else -> println("La opcion ingresada no es válida")
                }
            if (option=="2")
                viewRecipe()
            option = readLine()
            }
            println("Has seleccionado Salir")
        }

        fun makeRecipe(): String {
            val ingredientes: String = """
   		Selecciona por categoria el ingrediente que buscas:
            1. Agua
            2. Leche
            3. Carne
            4. Verduras
            5. Frutas
            6. Cereal
            7.Huevos
            8.Aceites"""
            return ingredientes
        }

        fun viewRecipe(){
            println("Elije unq categoria del 1 al 8 y 9 para volver al menu pricipal")
            var categoria : String? = readLine()
            while (categoria!= "9"){
                when(categoria){
                    "1" -> println("CategoriaAgua")
                    "2" -> println("CategoriaLeche")
                    "3" -> println("CategoriaCarne")
                    "4" -> println("CategoriaVerdura")
                    "5" -> println("CategoriaFrutas")
                    "6" -> println("CategoriaCereal")
                    "7" -> println("CategoriaHuevos")
                    "8" -> println("CategoriaAceites")
                    else -> println("La opcion ingresada no es válida")
                }
                categoria = readLine()
            }
            println("Has seleccionado volver al menu principal")
        }
