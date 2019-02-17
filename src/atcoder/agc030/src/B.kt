private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    val (L, N) = readLineInts()
    val X = Array(N) { readLine()!!.toLong() }.toMutableList()

    val upper = X.filter { it < L / 2 }.toMutableList()
    val lower = X.filter { it >= L / 2 }.map { L - it }.reversed().toMutableList()

    var ans = 0L
    var loc = 0L
    while (upper.isNotEmpty() || lower.isNotEmpty()) {
        println("${upper.joinToString(",")} / ${lower.joinToString(",")}")
        val du = upper.firstOrNull()?.let { it + if (loc < 0L) -loc else loc }
        val dl = lower.firstOrNull()?.let { it + if (loc > 0L) loc else -loc }

        println("$loc $ans")

        fun uf() {
            ans += du!!
            loc = upper[0]
            upper.removeAt(0)
        }

        fun lf() {
            ans += dl!!
            loc = -lower[0]
            lower.removeAt(0)
        }

        when {
            du == null -> lf()
            dl == null -> uf()
            du > dl -> uf()
            else -> lf()
        }

        println("$loc $ans")
    }

    println(ans)
}