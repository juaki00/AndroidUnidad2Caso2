package ej2

import ej1.Humano

class Cuenta(var numeroCuenta:String, var saldo:Float, var propietario: Persona) {
    constructor() : this("", 0f, Persona("", "","000000000"))

    init {
        if(saldo<0) throw IllegalArgumentException("Saldo negativo")
    }

    fun numeroCuenta(): String {
        return numeroCuenta
    }

    fun saldo(): Float {
        return saldo
    }

    fun propietario(): Persona {
        return propietario
    }

    fun numeroCuenta(numeroCuenta:String) {
        this.numeroCuenta = numeroCuenta
    }

    fun saldo(saldo:Float) {
        this.saldo = saldo
    }

    fun propietario(propietario:Persona) {
        this.propietario = propietario
    }

    fun transaccion(cantidad:Float, tipo: TipoTransaccion){
        if (tipo==TipoTransaccion.INGRESO){
            this.saldo+=cantidad
            println("Ingreso de $cantidad realizado, nuevo saldo: $saldo")
        }
        else{
            if(this.saldo>=cantidad){
                this.saldo-=cantidad
                println("Reintegro de $cantidad realizado, nuevo saldo: $saldo")
            }
            else{
                println("Reintegro no realizado, saldo insuficiente")
            }
        }
    }

    override fun toString(): String {
        return "Numero de cuenta: $numeroCuenta Saldo: $saldo Propietario: $propietario"
    }

}

enum class TipoTransaccion(){
    INGRESO , REINTEGRO
}