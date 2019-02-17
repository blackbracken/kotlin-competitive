private val scanner = java.util.Scanner(System.`in`)

private fun readInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    val N = readInts()[0]
    val A = readInts()

    val first = A[0]
    if (!A.any { it != first }) {
        println(first)
        return
    }

    fun minimize(list: List<Int>): Int {
        val min = list.min()!!
        val divided = list
            .map { if (it == min) min else it % min }
            .filter { it != 0 }
            .distinct()

        return when {
            divided.size == 1 -> divided[0]
            divided.contains(1) -> 1
            else -> minimize(divided)
        }
    }

    println(minimize(A.toList()))
}