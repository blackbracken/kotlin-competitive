package template

private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val A = readLine()!!
    val B = readLine()!!
    val C = readLine()!!

    var ans = 0
    for (i in 0 until N) {
        ans += when {
            A[i] == B[i] && B[i] == C[i] -> 0
            A[i] == B[i] || B[i] == C[i] || C[i] == A[i] -> 1
            else -> 2
        }
    }

    println(ans)
}