package controlefluxo

fun main(args: Array<String>) {

    val x = 5

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x não encontrado")
        }
    }

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("x == 3 or 4")
        else -> {
            println("x não encontrado")
        }
    }

    when (x) {
        x.compareTo(2) -> println(x)
        else -> {
            println("x não encontrado")
        }
    }

    val validNumbers = 11..13
    when (x) {
        in 1..10 -> println("x está entre 1 e 10")
        in validNumbers -> println("x está entre os números válidos")
        !in 14..17 -> println("x não está entre 14 e 17")
        else -> {
            println("x não encontrado")
        }
    }
}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}