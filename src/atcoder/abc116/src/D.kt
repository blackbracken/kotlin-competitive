private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    val (N, K) = readInts(2)
    val td = Array(N) { readInts(2) }

    var maxUmami = 0L
    val sorted = td.sortedWith(compareBy({ it[1] }, { it[0] }))
    val typeSet = mutableSetOf<Int>()
    for (i in 0 until K) {
        val (type, umami) = sorted[i]
        typeSet += type
        maxUmami += umami
    }

    if (!typeSet.isEmpty()) {
        maxUmami += typeSet.size * typeSet.size
    }

    println(maxUmami)
}