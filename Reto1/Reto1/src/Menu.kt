import Model.Categoria
import Model.Ingredientes
import Model.TiposDeCategoria

fun main(args: Array<String>) {

        val tipoCat = TiposDeCategoria()
        val ing = Ingredientes();


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
                    println("Has seleccionado Hacer recetas ${ing.ingredientes}")
                    tipoCat.MostrarIngredientesPorCategoria()
                }
                "2" -> {
                    println("Has seleccionado Ver mis recetas ${ing.ingredientes}")
                    tipoCat.elegirTipoDeCategoria()
                }

                    else -> println("La opcion ingresada no es válida")
                }
            println(menuRecetas)
            option = readLine()
            }
            println("Has seleccionado Salir")
        }
