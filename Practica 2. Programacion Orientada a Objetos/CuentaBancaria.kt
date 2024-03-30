/*
* Cree una clase CuentaBancaria que tenga saldo y limite de retiro
* Implemente los métodos set y get.
* autor: Diego Johann Humpiri Vargas
* fecha creación: 29 Marzo 2024
* fecha última modificación: 29 Marzo 2024
*/
class CuentaBancaria(saldo: Float = 0f, limite: Float = 0f) {
    var saldo: Float = saldo
        set(value) {
            if (value >= 0)
                field = value
            else
                println("El saldo no puede ser negativo")
        }
        get() {
            return field
        }
    var limite: Float = limite
        set(value) {
            if (value > 0)
                field = value
            else
                println("El límite no puede ser negativo")
        }
        get() {
            return field
        }
    fun realizarRetiro(monto: Float) {
        if ( monto <= this.saldo && monto <= this.limite) {
            this.saldo = this.saldo - monto
        } else {
            if ( monto > this.saldo ) {
                println("No se pudo realizar la operación, saldo insuficiente.")
            } else {
                println("No se pudo realizar la operación, excedió el límite de retiro.")
            }
        }
    }
}
fun main() {
    val cuentas = CuentaBancaria(5000f, 2000f)
    println("El saldo de su cuenta es: ${cuentas.saldo} y su límite de retiro es: ${cuentas.limite}")
    cuentas.realizarRetiro(2500f)
    cuentas.saldo = -100f
    cuentas.limite = -1000f
    cuentas.saldo = 10000f
    cuentas.realizarRetiro(2000f)
    println("El saldo de su cuenta es: ${cuentas.saldo} y su límite de retiro es: ${cuentas.limite}")
    cuentas.realizarRetiro(2000f)
}