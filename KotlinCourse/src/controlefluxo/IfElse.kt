package controlefluxo

fun main(args: Array<String>) {

    val a = 10
    val b = 11

    //Modo Tradicional
    var max1 = a
    if (a < b) max1 = b
    println(max1)

    //If/else
    val max2: Int
    if (a < b) {
        max2 = b
    } else {
        max2 = a
    }
    println(max2)

    //Expressão
    val max3 = if (a < b) b else a
    println(max3)


    val max4 = if(a<b) {
        //Código
        b
    } else {
        //Código
        a
    }
    println(max4)


}