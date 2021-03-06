private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    val (N, K) = readLineInts()
    val h = Array(N) { readLine()!!.toInt() }

    val sorted = h.sorted()
    var min = Int.MAX_VALUE
    for (n in 0 .. N - K) {
        val diff = sorted[n + (K - 1)] - sorted[n]
        if (diff < min) min = diff
    }

    println(min)
}