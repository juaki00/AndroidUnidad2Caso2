class Humano(edad:Int, var nombre:String): SerVivo(edad) {

    override fun equals(other: Any?): Boolean {
        val otroSer: Humano = other as Humano

        return this.edad == otroSer.edad && this.nombre.length == other.nombre.length
    }

    fun mayor(otro: Humano): Humano {
        val elMayor: Humano
        if(this.edad > otro.edad){
            elMayor = this
        }
        else if(this.edad < otro.edad){
            elMayor = otro
        }
        else if(this.nombre.length > otro.nombre.length){
            elMayor = this
        }
        else{
            elMayor = otro
        }
        return elMayor
    }

    override fun toString(): String {
        return "$nombre($edad)"
    }
}