package desafios

fun main(args: Array<String>) {

    val value = 1300

    for (i in 3..10) {
        val increase = getIncrease(i, value)
        val total: Float = value + increase
        val splitValue = "%.2f".format(total.div(i))
        println("$i x $splitValue = $total")
    }
}

private fun getIncrease(splits: Int, value: Int): Float {
    val mapSliptsInterest = hashMapOf(
            2 to 4.59,
            3 to 5.99,
            4 to 7.69,
            5 to 8.99,
            6 to 10.49,
            10 to 12.99,
            12 to 13.99)
    var totalInterest = 0f
    val interest = mapSliptsInterest[splits]
    if (interest != null) {
        totalInterest = (value * (interest.div(100))).toFloat()
    }
    return totalInterest
}