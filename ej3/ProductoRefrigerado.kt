package ej3

class ProductoRefrigerado(f_caducidad:String, num_lote:Int, var codigo_envasado:Int):Producto(f_caducidad, num_lote){

    override fun toString(): String {
        return "Producto fresco = Fecha de caducidad: $f_caducidad  Codigo de envasado: $codigo_envasado Numero de lote: $num_lote"
    }
}