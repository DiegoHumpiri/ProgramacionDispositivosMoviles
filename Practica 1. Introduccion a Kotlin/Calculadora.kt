/*
* Realizar una calculadora básica. Imprimir un menú
* autor: Diego Johann Humpiri Vargas
* fecha creación: 23 Marzo 2024
* fecha última modificación: 23 Marzo 2024
 */
fun main() {
    var opcion: Int
    var operando1: Float
    var operando2: Float
    do {
        println("===== Menú =====")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Salir\nEliga una opción:")
        opcion = readln().toInt()
        // Si se elige la opción 5, el programa termina
        if(opcion == 5) {
            println("Hasta luego.")
            break
        }
        println("Ingrese primer operando")
        operando1 = readln().toFloat()
        println("Ingrese segundo operando")
        operando2 = readln().toFloat()
        when(opcion) {
            1-> println("Resultado: " + (operando1 + operando2) )
            2-> println("Resultado: " + (operando1 - operando2) )
            3-> println("Resultado: " + (operando1 * operando2) )
            4-> println("Resultado: " + (operando1 / operando2) )
        }
    } while(true)
}