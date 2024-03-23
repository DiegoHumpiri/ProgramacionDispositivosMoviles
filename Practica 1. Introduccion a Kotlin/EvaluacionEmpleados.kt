/*
*,Obtener el dinero recibido de acuerdo a la puntuación
* y el sueldo y mostrar su nivel de rendimiento.
* autor: Diego Johann Humpiri Vargas
* fecha creación: 23 Marzo 2024
* fecha última modificación: 23 Marzo 2024
*/
fun main() {
    println("Ingrese sueldo: ")
    val sueldo = readln().toFloat()
    println("Ingrese puntuación: ")
    val puntuacion = readln().toInt()

    evaluarEmpleado(puntuacion, sueldo)
}
/*
* Calcula el dinero conseguido de acuerdo a la puntuacion y el
* salario. Imprime su rendimiento y el dinero conseguido.
*/
fun evaluarEmpleado(puntuacion: Int, salario: Float) {
    var dineroExtra : Float = salario * ( puntuacion.toFloat()/10 )
    when( puntuacion ) {
        in 0..3 -> println("Nivel de Rendimiento: Inaceptable.")
        in 4..6 -> println("Nivel de Rendimiento: Aceptable.")
        in 7..10 -> println("Nivel de Rendimiento: Meritorio.")
        else -> {
            print("Puntuacion inválida.")
            return
        }
    }
    println("Cantidad de Dinero Recibido: $dineroExtra")
}