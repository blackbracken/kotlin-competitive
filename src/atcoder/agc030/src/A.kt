private val scanner = java.util.Scanner(System.`in`)

private fun readInts(n: Int) = Array(n) { scanner.nextInt() }
private fun readLongs(n: Int) = Array(n) { scanner.nextLong() }
private fun readLineInts() = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
private fun readLineLongs() = readLine()!!.split(" ").map { it.toLong() }.toTypedArray()

fun main(args: Array<String>) {
    var (A, B, C) = readInts(3)
    var ans = 0

    for (c in 0 until C) {
        if (A > 0) {
            A--
            ans++
            continue
        }

        if (B > 0) {
            B--
            ans += 2
            continue
        }

        ans++
        break
    }

    println(ans + B)
}