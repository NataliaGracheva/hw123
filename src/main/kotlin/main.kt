import kotlin.math.floor
import kotlin.math.roundToInt

fun main() {
    var amount = 1000
    var isMeloman = true
    calcDiscount(amount, isMeloman)
    amount = 1001
    isMeloman = false
    calcDiscount(amount, isMeloman)
    amount = 10000
    isMeloman = true
    calcDiscount(amount, isMeloman)
    amount = 10001
    isMeloman = true
    calcDiscount(amount, isMeloman)
}

fun calcDiscount(amount: Int, isMeloman: Boolean) {
    println("покупка - $amount руб. →")
    var result = amount.toDouble()
    if (amount in 0..1000) {
        println("общая скидка не предоставляется")
    }
    else if (amount in 1001..10000) {
        result -= 100
        println("после применения скидки 100 руб. - $result руб.")
    }
    else if (amount >= 10001) {
        result = (result * 0.95 * 100).roundToInt() / 100.0
        println("после применения 5% скидки - $result руб.")
    }

    if (isMeloman) {
        result = (result * 0.99 * 100).roundToInt() / 100.0
        println("после применения 1% скидки - $result руб.")
    }
}