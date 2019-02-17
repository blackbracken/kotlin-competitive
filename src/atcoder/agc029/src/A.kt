private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    val S = readLine()!!.map { it == 'B' }.toTypedArray()
    val size = S.size

    val sum = Array(size) { 0 }
    for (i in 0 until size) sum[i] += (if (S[i]) 1 else 0) + (if (i == 0) 0 else sum[i - 1])

    var count = 0
    for (i in 0 until S.size) if (!S[i]) count += sum[i]

    println(count)
}