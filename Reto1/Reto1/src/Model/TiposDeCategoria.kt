package Model
class TiposDeCategoria {

    val agua = Categoria("agua", "1. agua")
    val lacteos = Categoria("lacteos", """1.leche 2.queso 3.crema""")
    val carnes = Categoria("carnes","""1.pollo 2.cerdo 3.pavo 4.vaca 5.pescado""")
    val verduras = Categoria("verduras", """1.remolacha 2.lechuga 3.zanahoria 4.cebolloa 5.ajo 6.morrón""")
    val frutas = Categoria("frutas", """1.fresa, 2.platano 3.uva 4.manzana 5.naranja 6.pera 7.ceeza""")
    val cereales = Categoria("cereales", """1.avena 2.trigo 3.maiz 4.arroz""")
    val huevos = Categoria ("huevos", "1. huevos")
    val legumbres = Categoria ("legumres", """1.lentejas 2.arvejas, 3.porotos""")
    val aceites = Categoria ("aceites", """1.girasol 2.oliva 3.maiz""")


    fun elegirTipoDeCategoria() {
        println("Elije una categoria del 1 al 9 o 0 para volver al menu principal")
        var categoria: String? = readLine()
        while (categoria != "0") {

            when (categoria) {
                "1" -> println("Categoria ${agua.nombre}")
                "2" -> println("Categoria ${lacteos.nombre}")
                "3" -> println("Categoria ${carnes.nombre}")
                "4" -> println("Categoria ${verduras.nombre}")
                "5" -> println("Categoria ${frutas.nombre}")
                "6" -> println("Categoria ${cereales.nombre}")
                "7" -> println("Categoria ${huevos.nombre}")
                "8" -> println("Categoria ${legumbres.nombre}")
                "9" -> println("Categoria ${aceites.nombre}")
                else -> println("La opcion ingresada no es válida")
            }
            println("Elije una categoria del 1 al 9 y 0 para volver al menu pricipal")
            categoria = readLine()

        }
        println("Has seleccionado volver al menu principal")
    }

    fun MostrarIngredientesPorCategoria() {
        var categoria: String? = readLine()
        while (categoria != "0") {
            println("Estos son los ingredientes para esta categoría:")
            when (categoria) {
                "1" -> println("Categoria ${agua.ingredientes}")
                "2" -> println("Categoria ${lacteos.ingredientes}")
                "3" -> println("Categoria ${carnes.ingredientes}")
                "4" -> println("Categoria ${verduras.ingredientes}")
                "5" -> println("Categoria ${frutas.ingredientes}")
                "6" -> println("Categoria ${cereales.ingredientes}")
                "7" -> println("Categoria ${huevos.ingredientes}")
                "9" -> println("Categoria ${legumbres.ingredientes}")
                "9" -> println("Categoria ${aceites.ingredientes}")
                else -> println("La opcion ingresada no es válida")
            }
            println("Elije otra categoria del 1 al 9 o 0 para volver al menu pricipal")
            categoria = readLine()
        }
        println("Has seleccionado volver al menu principal")
    }

}

