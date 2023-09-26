package ej2

fun main() {
    var persona1 = Persona("Joaquin","Romero","123456789")
    var persona2 = Persona("Paco","Diaz","987654321")

    var cuenta1 = Cuenta("1234",300f,persona1)
    var cuenta2 = Cuenta("1235",500f,persona2)

    println(cuenta1)
    println(cuenta2)

    cuenta1.transaccion(100f,TipoTransaccion.INGRESO)
    cuenta1.transaccion(150f,TipoTransaccion.REINTEGRO)

    cuenta2.transaccion(10f,TipoTransaccion.INGRESO)
    cuenta2.transaccion(250f,TipoTransaccion.REINTEGRO)

    println(cuenta1)
    println(cuenta2)

}