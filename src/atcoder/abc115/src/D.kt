private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    var (N, X) = readLineInts()

    fun p(level: Int, amount: Int = 5): Int = if (level == 1) amount else p(level - 1, 2 * amount + 3)
    val amount = p(N)

    var ans = 0

    val allP = amount / 2 // + 1
    val halfP = allP / 2
    val allB = amount / 2

    if (X > amount / 2) {
        X /= 2
        ans += halfP
    }



    if (X > amount / 2 + 1) ++ans

    var burger = "P"
    println(burger)
    for (i in 2..20) {
        val before = burger
        burger = "B${before}P${before}B"

        println("${burger.count { it == 'B' }} ${burger.count { it == 'P' }}")
    }


}