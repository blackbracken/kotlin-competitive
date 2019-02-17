fun main(args: Array<String>) {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val X = readLine()!!.split(" ").map { it.toInt() }

    val sortedX = X.sorted()
    val spaces = (0 until M - 1).map { sortedX[it + 1] - sortedX[it] }

    try {
        println(Math.max(0, spaces.sorted().reversed().drop(N - 1).sum()))
    } catch (ex: Exception) {
        println("0")
    }
}