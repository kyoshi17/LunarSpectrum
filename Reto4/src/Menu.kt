import java.io.BufferedReader
import java.io.InputStreamReader

val recipe = Receta()
val lisReceta = arrayListOf<String>()

fun main() {

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
                println("Has seleccionado Hacer recetas")
                makeRecipe()
            }
            "2" -> {
                println("Has seleccionado Ver mis recetas ")
                viewRecipe()
            }

            else -> println("La opcion ingresada no es válida")
        }
        println(menuRecetas)
        option = readLine()
    }
    println("Has seleccionado Salir")


}

fun makeRecipe() {
    val ingredient = Ingrediente("nombre", 0)
    val datos = Datos()
    println("Elige un nombre para tu receta")
    recipe.nombre = readLine().toString()
    val listaCategorias: String = """" 
                Selecciona por categoria el ingrediente que buscas:
                1. Agua
                2. Lacteos
                3. Carnes
                4. Verduras
                5. Frutas
                6. Cereales
                7.Huevos
                8.Legunbres
                9.Aceites
                0.Volver al Menú Principal"""
    println(listaCategorias)
    var categoria: String? = readLine()
    var menu2: String = """ 
|          //////  Primero seleccionas el que quieras agregar a la receta  
|          //////  Luego la cantidad que desea incorporar""".trimMargin()
    println(menu2)
    while (categoria !=  "0") {
        when (categoria) {
            "1" -> {
                println(datos.agua.hashMap)
                var ing: Int = readLine()!!.toInt()
                ingredient.nombre = datos.agua.hashMap[ing].toString()
                var cant: Int = readLine()!!.toInt()
                ingredient.cant = cant
                recipe.listaIngredientes.add(ingredient);

            }
            "2" -> {
                println(datos.lacteos.hashMap)
                var ing: Int = readLine()!!.toInt()
                ingredient.nombre = datos.lacteos.hashMap[ing].toString()
                var cant: Int = readLine()!!.toInt()
                ingredient.cant = cant
                recipe.listaIngredientes.add(ingredient);
            }
            "3" -> {
                println(datos.carnes.hashMap)
                var ing: Int = readLine()!!.toInt()
                ingredient.nombre = datos.carnes.hashMap[ing].toString()
                var cant: Int = readLine()!!.toInt()
                ingredient.cant = cant
                recipe.listaIngredientes.add(ingredient);
            }
            "4" -> {
                println(datos.verduras.hashMap)
                var ing: Int = readLine()!!.toInt()
                ingredient.nombre = datos.verduras.hashMap[ing].toString()
                var cant: Int = readLine()!!.toInt()
                ingredient.cant = cant
                recipe.listaIngredientes.add(ingredient);
            }
            "5" -> {
                println(datos.frutas.hashMap)
                var ing: Int = readLine()!!.toInt()
                ingredient.nombre = datos.frutas.hashMap[ing].toString()
                var cant: Int = readLine()!!.toInt()
                ingredient.cant = cant
                recipe.listaIngredientes.add(ingredient);
            }
            "6" -> {
                println(datos.cereales.hashMap)
                var ing: Int = readLine()!!.toInt()
                ingredient.nombre = datos.cereales.hashMap[ing].toString()
                var cant: Int = readLine()!!.toInt()
                ingredient.cant = cant
                recipe.listaIngredientes.add(ingredient);
            }
            "7" -> {
                println(datos.huevos.hashMap)
                var ing: Int = readLine()!!.toInt()
                ingredient.nombre = datos.verduras.hashMap[ing].toString()
                var cant: Int = readLine()!!.toInt()
                ingredient.cant = cant
                recipe.listaIngredientes.add(ingredient);
            }
            "8" -> {
                println(datos.legumbres.hashMap)
                var ing: Int = readLine()!!.toInt()
                ingredient.nombre = datos.legumbres.hashMap[ing].toString()
                var cant: Int = readLine()!!.toInt()
                ingredient.cant = cant
                recipe.listaIngredientes.add(ingredient);
            }
            "9" -> {
                println(datos.aceites.hashMap)
                var ing: Int = readLine()!!.toInt()
                ingredient.nombre = datos.aceites.hashMap[ing].toString()
                var cant: Int = readLine()!!.toInt()
                ingredient.cant = cant
                recipe.listaIngredientes.add(ingredient);
            }
            else -> println("La opcion ingresada no es válida")
        }
        println(listaCategorias)
        categoria = readLine()
        println(menu2)
    }
    lisReceta.add(recipe.nombre)
}

fun viewRecipe(){
    print(lisReceta)
}
