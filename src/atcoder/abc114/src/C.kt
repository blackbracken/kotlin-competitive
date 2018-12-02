private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

private fun String.toIntOrNull(): Int? = try { this.toInt() } catch (ignored: Throwable) { null }

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    val digit = N.toString().length
    val matchSet = setOf('3', '5', '7').map { it.toString() }
    val notMatchSet = ('0'..'9').map { it.toString() }.filter { it !in matchSet }

    fun f(text: String = "", count: Int = 0): Int {
        return if (text.length == count && count < digit) {
            matchSet.plus("").map { f(text + it, count + 1) }.sum()
        } else {
            when {
                text.toIntOrNull() ?: -1 > N -> 0
                matchSet.any { !text.contains(it) } -> 0
                notMatchSet.any { text.contains(it) } -> 0
                else -> 1
            }
        }
    }

    println(f())
}