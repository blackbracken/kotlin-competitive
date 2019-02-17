private val scanner = java.util.Scanner(System.`in`)

private fun readInts() = readLine()!!.split(" ").map { it.toInt() }
private fun readLongs() = readLine()!!.split(" ").map { it.toLong() }

fun main(args: Array<String>) {
    val (A, B) = readInts()

    println(if (B % A == 0) A + B else B - A)
}