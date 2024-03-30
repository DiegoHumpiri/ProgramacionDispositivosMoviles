/*
* Crea un sistema de gestión de empleados que incluya las siguientes clases:
* Empleado, EmpleadoTiempoCompleto, EmpleadoMedioTiempo
* autor: Diego Johann Humpiri Vargas
* fecha creación: 29 Marzo 2024
* fecha última modificación: 29 Marzo 2024
*/
abstract class Empleado(
    var nombre: String,
    var apellido: String,
    edad: Int,
    salario: Float
) {
    abstract fun calcularPago(): Float
}
class EmpleadoTiempoCompleto(
        nombre: String,
        apellido: String,
        edad: Int,
        salario: Float,
        horasTrabajadas: Int = 0,
        tarifaHora: Float = 0f
) : Empleado(
    nombre,
    apellido,
    edad,
    salario
) {
    override fun calcularPago(): Float {
        // 20 días laborables de la semana aproximadamente
        return this.horasTrabajadas * this.tarifaHora * 20
    }
    var edad: Int = edad
        set(value) {
            if (value >= 0)
                field = value
            else
                println("La edad no puede ser negativo")
        }
        get() {
            return field
        }
    var salario: Float = salario
        set(value) {
            if (value >= 0)
                field = value
            else
                println("El salario no puede ser negativo")
        }
        get() {
            return field
        }
    var horasTrabajadas: Int = horasTrabajadas
        set(value) {
            if (value >= 0)
                field = value
            else
                println("Las horas trabajadas no pueden ser negativas")
        }
        get() {
            return field
        }
    var tarifaHora: Float = tarifaHora
        set(value) {
            if (value >= 0)
                field = value
            else
                println("La tarifa por hora no puede ser negativa")
        }
        get() {
            return field
        }
}
class EmpleadoMedioTiempo (
        nombre: String,
        apellido: String,
        edad: Int,
        salario: Float,
        horasTrabajadas: Int = 0,
        tarifaHora: Float = 0f,
        diasTrabajados: Int = 0
) : Empleado(
    nombre = nombre,
    apellido = apellido,
    edad = edad,
    salario = salario
) {
    override fun calcularPago(): Float {
        return return this.horasTrabajadas * this.tarifaHora * diasTrabajados
    }
    var edad: Int = edad
        set(value) {
            if (value >= 0)
                field = value
            else
                println("La edad no puede ser negativo")
        }
        get() {
            return field
        }
    var salario: Float = salario
        set(value) {
            if (value >= 0)
                field = value
            else
                println("El salario no puede ser negativo")
        }
        get() {
            return field
        }
    var horasTrabajadas: Int = horasTrabajadas
        set(value) {
            if (value >= 0)
                field = value
            else
                println("Las horas trabajadas no pueden ser negativas")
        }
        get() {
            return field
        }
    var tarifaHora: Float = tarifaHora
        set(value) {
            if (value >= 0)
                field = value
            else
                println("La tarifa por hora no puede ser negativa")
        }
        get() {
            return field
        }
    var diasTrabajados: Int = diasTrabajados
        set(value) {
            if (value >= 0)
                field = value
            else
                println("Los días trabajados no pueden ser negativas")
        }
        get() {
            return field
        }
}
fun main() {
    val empleadoCompleto = EmpleadoTiempoCompleto(
        "Arturito",
        "Roboton",
        35,
        10000f,
        40,
        500f
    )
    println("El sueldo de ${empleadoCompleto.nombre} es: ${empleadoCompleto.calcularPago()}")
    val empleadoMedio = EmpleadoMedioTiempo(
        "Carmen",
        "Aguilar",
        23,
        10000f,
        40,
        1500f,
        11
    )
    println("El sueldo de ${empleadoMedio.nombre} es: ${empleadoMedio.calcularPago()}")
}