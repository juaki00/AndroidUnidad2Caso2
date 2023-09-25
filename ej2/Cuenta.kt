package ej2

import ej1.Humano

class Cuenta(var numeroCuenta:String, var saldo:Float, var propietario: Humano) {
    constructor() : this("", 0f, Humano(0, ""))

    init {
        if(saldo<0) throw IllegalArgumentException("Saldo negativo")
    }

    fun getNumeroCuenta(): String {
        return numeroCuenta
    }

    fun getSaldo(): Float {
        return saldo
    }

    fun getPropietario(): Humano {
        return propietario
    }

    fun setNumeroCuenta(numeroCuenta:String) {
        this.numeroCuenta = numeroCuenta
    }

    fun setSaldo(saldo:Float) {
        this.saldo = saldo
    }

    fun setPropietario(propietario:Humano) {
        this.propietario = propietario
    }

    fun transaccion(cantidad:Float, tipo: TipoTransaccion){
        if (tipo==TipoTransaccion.INGRESO){
            this.saldo+=cantidad
            println("Ingreso realiado, nuevo saldo: $saldo")
        }
        else{
            if(this.saldo>=cantidad){
                this.saldo-=cantidad
                println("Reintegro realiado, nuevo saldo: $saldo")
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