private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    val s = readLine()!!.toInt()

    fun f(n: Int) = if (n % 2 == 0) n / 2 else n * 3 + 1

    val list = mutableListOf(s)
    for (i in 2..100000000) {
        val m = f(list.last())

        if (m in list) {
            println(i)
            return
        }

        list.add(m)
    }
}