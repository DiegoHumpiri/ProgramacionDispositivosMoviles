/*
* Diseña un sistema de alquiler de vehículos que incluya interfaces como VehiculoAlquilable
* con métodos para alquilar y devolver un vehículo, y clases concretas como Coche y Moto
* que implementen esta interfaz.
* autor: Diego Johann Humpiri Vargas
* fecha creación: 29 Marzo 2024
* fecha última modificación: 29 Marzo 2024
*/
interface VehiculoAlquilable {
    // Devuelve el costo del alquiler
    fun arquilar(diasAlquilable: Int): Float
    fun devolver(kilometrosRecorridos: Float)
}
class Coche (
    var placa: String = "ABC-001",
    var marca: String = "",
    var modelo: String = "",
    var kilometraje: Float = 0f,
    var numeroAsistentos: Int = 4
) : VehiculoAlquilable {
    override fun arquilar(diasAlquilable: Int): Float {
        return diasAlquilable * 150f
    }
    override fun devolver(kilometrosRecorridos: Float) {
        this.kilometraje = this.kilometraje + kilometrosRecorridos
    }
}
class Moto (
    var placa: String = "AZ-0001",
    var marca: String = "",
    var modelo: String = "",
    var kilometraje: Float = 0f
) : VehiculoAlquilable  {
    override fun arquilar(diasAlquilable: Int): Float {
        return diasAlquilable * 50f
    }
    override fun devolver(kilometrosRecorridos: Float) {
        this.kilometraje = this.kilometraje + kilometrosRecorridos
    }
}
fun main(){
    val motoAlquiler = Moto(
        "MO-1234",
        "Honda",
        "Wave 3000 CD"
    )
    println("Alquilar la moto 4 días cuesta ${motoAlquiler.arquilar(4)}")
    motoAlquiler.devolver(1400f)
    println("El nuevo kilometraje es: ${motoAlquiler.kilometraje}")
    println()
    val carro = Coche(
        "ZZZ-234",
        "Ford",
        "Fiesta Eco",
        50111f,
        5
    )
    println("Alquilar el coche 9 días cuesta ${carro.arquilar(9)}")
    carro.devolver(3400f)
    println("El nuevo kilometraje es: ${carro.kilometraje}")
}