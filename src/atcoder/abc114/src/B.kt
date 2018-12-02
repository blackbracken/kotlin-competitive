private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    val S = readLine()!!

    var ans = Int.MAX_VALUE
    for (s in 2 until S.length) {
        val value = Math.abs("${S[s - 2]}${S[s - 1]}${S[s]}".toInt() - 753)
        if (ans > value) ans = value
    }

    println(ans)
}
