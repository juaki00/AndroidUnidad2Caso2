open class SerVivo(private val edad: Int){

    override fun equals(otro: Any?): Boolean {
        val otroSer: SerVivo = otro as SerVivo

        return this.edad == otroSer.edad
    }

    fun mayor(otro: SerVivo): SerVivo {
        var elMayor: SerVivo
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