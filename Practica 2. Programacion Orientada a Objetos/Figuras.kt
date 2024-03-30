/*
* Cree una clase abstracta Shape con las propiedades área y perímetro
* y las funciones para su cálculo. Cree tres subclases que ejecuten sus operaciones.
* autor: Diego Johann Humpiri Vargas
* fecha creación: 29 Marzo 2024
* fecha última modificación: 29 Marzo 2024
*/
abstract class Shape(nombre: String) {
    var area: Float = 0f
        get() {
            field = this.calcularArea()
            return field
        }
    var perimetro: Float = 0f
        get() {
            field = this.calcularPerimetro()
            return field
        }
    var nombre: String = ""
    abstract fun calcularArea(): Float
    abstract fun calcularPerimetro(): Float
}
class Cuadrado(nombre: String = ""): Shape(nombre) {
    var lado: Float = 0f
    constructor(nombre: String = "", lado: Float) : this(nombre){
        this.lado = lado
    }
    override fun calcularArea(): Float {
        return this.lado * this.lado
    }
    override fun calcularPerimetro(): Float {
        return this.lado * 4
    }
}

class Circulo(nombre: String = ""): Shape(nombre) {
    var radio: Float = 0f
    constructor(nombre: String = "", radio: Float) : this(nombre){
        this.radio = radio
    }
    override fun calcularArea(): Float {
        return (Math.PI).toFloat() * this.radio * this.radio
    }
    override fun calcularPerimetro(): Float {
        return (Math.PI).toFloat() * 2 * this.radio
    }
}
class Rectangulo(nombre: String = ""): Shape(nombre) {
    var ancho: Float = 0f
    var largo: Float = 0f
    constructor(nombre: String = "", ancho: Float, largo: Float) : this(nombre){
        this.ancho = ancho
        this.largo = largo
    }
    override fun calcularArea(): Float {
        return this.ancho * this.largo
    }
    override fun calcularPerimetro(): Float {
        return 2 * (this.ancho + largo)
    }
}
fun main() {
    val vectorShapes = arrayOf( Cuadrado("Cuadrado", 5f),
                                Circulo("Circulo", 10f),
                                Rectangulo("Rectangulo", 3f, 7f) )
    for ( figura in vectorShapes ){
        println("El área del ${figura.nombre} es: ${figura.calcularArea()}")
        println("El perímetro del ${figura.nombre} es: ${figura.calcularPerimetro()}")
    }
}