package ej3

class ProductoCongelado(f_caducidad:String, num_lote:Int, var temperatura_recomendada:Int):Producto(f_caducidad, num_lote){

    override fun toString(): String {
        return "Producto fresco = Fecha de caducidad: $f_caducidad  Temperatura recomendada: $temperatura_recomendada Numero de lote: $num_lote"
    }
}