/*
* Escribir un rograma que realiza el juego de
* piedra papel o tijera entre la computadora y el usuario
* autor: Diego Johann Humpiri Vargas
* fecha creación: 23 Marzo 2024
* fecha última modificación: 23 Marzo 2024
 */
fun main(){
    // Elección aleatoria de la computadora
    val eleccionPC = (1..3).random()
    println("1: piedra")
    println("2: papel")
    println("3: tijera")
    println("Elija piedra, papel o tijera:")
    val eleccion = readln().toInt()
    jugar(eleccionPC, eleccion)
}
/*
* La función jugar compara las elecciones de la computadora
* y el jugador, y luego indica el ganador o si empataron
 */
fun jugar( eleccionPC: Int, eleccion: Int ) {
    when(eleccionPC) {
        1 -> println("La computadora eligió piedra")
        2 -> println("La computadora eligió papel")
        3 -> println("La computadora eligió tijera")
    }
    if( eleccion == eleccionPC )
        println("Usted empató")
    else {
        when(eleccion) {
            1 -> {
                if( eleccionPC == 3 )
                    println("Usted ganó")
                else
                    println("Usted perdió")
            }
            2 -> {
                if( eleccionPC == 1 )
                    println("Usted ganó")
                else
                    println("Usted perdió")
            }
            3 -> {
                if( eleccionPC == 2 )
                    println("Usted ganó")
                else
                    println("Usted perdió")
            }
            else -> println("Elección incorrecta")
        }
    }
}