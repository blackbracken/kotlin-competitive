private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val L = readLine()!!.split(" ").map { it.toInt() }
    val sortedL = L.sorted()
    val others = (0 until N - 1).map { sortedL[it] }.sum()

    println(if (others > sortedL.max()!!) "Yes" else "No")
}