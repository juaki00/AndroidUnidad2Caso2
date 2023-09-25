package ej2

class Persona(val nombre:String, val apellido:String, val telefono:String) {
    init {
        if(telefono.length != 9) {
            throw IllegalArgumentException("El numero de telefono tiene que tener 9 cifras")
        }
        for(i in 0..8 ) {
            if (!telefono[i].isDigit()) {
                throw IllegalArgumentException("Numero de telefono incorrecto")
            }
        }
    }

}
