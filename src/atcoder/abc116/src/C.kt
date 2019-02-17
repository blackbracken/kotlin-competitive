private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val h = readInts(N).toList()

    var count = 0
    val flowers = h.toMutableList()
    for (w in 0 until h.max()!!) {
        val line = flowers.joinToString("") { if (it > 0) it.toString().replace("0", "A") else it.toString() }
        count += line.split("0").filter { it.trim() != "" }.size
        for ((index, value) in flowers.withIndex()) {
            if (value > 0) flowers[index]--
        }
    }

    println(count)
}