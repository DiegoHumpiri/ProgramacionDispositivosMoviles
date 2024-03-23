/*
* Escribe un programa que genere un número aleatorio entre 1 y 30,
* luego pida al usuario que adivine el número
* autor: Diego Johann Humpiri Vargas
* fecha creación: 23 Marzo 2024
* fecha última modificación: 23 Marzo 2024
 */
fun main() {
    var numero = (1..30).random()
    var adivino: Boolean = false
    var eleccion: Int
    println("Adivine el número secreto entre 1 y 30.")
    for(i in 1..5){
        print("Ingrese número: ")
        eleccion = readln().toInt()
        if(eleccion == numero) {
            println("Felicidades adivinó el número secreto")
            adivino = true
            break
        } else {
            if(i != 5 ) {
                if( eleccion > numero ) {
                    println("El número es mayor. Intente de nuevo")
                } else {
                    println("El número es menor. Intente de nuevo")
                }
            }
        }
    }
    if( !adivino )
        println("Game over.")
}