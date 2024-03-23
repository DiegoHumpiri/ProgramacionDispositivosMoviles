/*
* Preguntar cuántos alumnos hay en un salon e ingresar su
* edad de cada uno de ellos. Mostrar la edad máxima y mínima.
* autor: Diego Johann Humpiri Vargas
* fecha creación: 23 Marzo 2024
* fecha última modificación: 23 Marzo 2024
 */
fun main() {
    println("Ingrese la cantidad de alumnos: ")
    val cantidadAlumnos = readln().toInt()
    val edadesArray = IntArray(cantidadAlumnos)
    for(i in 1..cantidadAlumnos) {
        println("Ingresar edad alumno #$i:")
        edadesArray[(i-1)] = readln().toInt()
    }
    println("===== Edades =====")
    println( "Maximo: ${edadesArray.max()}" )
    println( "Minimo: ${edadesArray.min()}" )
    print("Todos = ")
    for(i in edadesArray.indices){
        if(i != edadesArray.size - 1)
            print("${edadesArray[i]}, ")
        else
            println("${edadesArray[i]} ")
    }
}