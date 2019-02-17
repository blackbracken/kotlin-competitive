private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

private val KEYENCE = "keyence"

fun main(args: Array<String>) {
    val S = readLine()!!

    for (i in 0 until KEYENCE.length) {
        val raw = "${KEYENCE.dropLast(i + 1)}.*${KEYENCE.drop(KEYENCE.length - i - 1)}"

        if (Regex(raw).matches(S)) {
            println("YES")
            return
        }
    }

    if (Regex("${KEYENCE}.*").matches(S)) {
        println("YES")
        return
    }

    println("NO")
}