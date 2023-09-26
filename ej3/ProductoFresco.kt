package ej3

class ProductoFresco(f_caducidad:String, num_lote:Int, var fecha_envasado:String, var pais_origen:String):Producto(f_caducidad, num_lote){

    override fun toString(): String {
        return "Producto fresco = Fecha de caducidad: $f_caducidad  Fecha de envasado: $fecha_envasado Numero de lote: $num_lote Pais de origen: $pais_origen"
    }

}