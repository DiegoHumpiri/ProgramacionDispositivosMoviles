/*
* Diseña una clase Producto que tenga un precio y un descuento aplicable.
* autor: Diego Johann Humpiri Vargas
* fecha creación: 29 Marzo 2024
* fecha última modificación: 29 Marzo 2024
*/
class Producto(val nombre: String, precio: Float = 0f, descuento: Float = 0f) {
    var precio: Float = precio
        set(value) {
            if (value >= 0)
                field = value
            else
                println("El precio no puede ser negativo")
        }
        get() {
            return field
        }
    var descuento: Float = descuento
        set(value) {
            if (value >= 0 && value <= 100)
                field = value
            else
                println("El descuento debe estar entre 0 y 100")
        }
        get() {
            return field
        }
    fun calcularPrecioFinal(): Float {
        return this.precio - (precio * descuento/100)
    }
}

fun main() {
    val product = Producto("Lagtog Lenovo", 4000f, 50f)
    println("El precio del producto ${product.nombre} es: ${product.calcularPrecioFinal()}")
    println("El precio del producto ${product.nombre} sin descuento es: ${product.precio}")
    product.descuento = 111f
    product.descuento = 25f
    println("El precio del producto ${product.nombre} es: ${product.calcularPrecioFinal()}")
    product.precio = -123f
    product.precio = 5000f
    println("El precio del producto ${product.nombre} es: ${product.calcularPrecioFinal()}")
}