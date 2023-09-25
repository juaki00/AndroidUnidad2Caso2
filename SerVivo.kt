open class SerVivo(var edad: Int){

    override fun equals(other: Any?): Boolean {
        val otroSer: SerVivo = other as SerVivo

        return this.edad == otroSer.edad
    }

    fun mayor(otro: SerVivo): SerVivo {
        val elMayor: SerVivo
        if(this.edad > otro.edad){
            elMayor = this
        }
        else{
            elMayor = otro
        }
        return elMayor
    }

    override fun toString(): String {
        return "Ser vivo de edad $edad"
    }

}