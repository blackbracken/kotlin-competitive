import java.util.*

private fun readInts() = readLine()!!.split(" ").map { it.toInt() }
private fun readLongs() = readLine()!!.split(" ").map { it.toLong() }
private fun <K, V> Map<out K, V>.toMutableMap(): MutableMap<K, V> = LinkedHashMap(this)
private fun <K, V> Iterable<Pair<K, V>>.toMutableMap(): MutableMap<K, V> = this.toMap().toMutableMap()
private fun <K, V> mutableMapOf(): MutableMap<K, V> = LinkedHashMap()
private fun <K, V> mutableMapOf(vararg pairs: Pair<K, V>) = pairs.toMap().toMutableMap()

fun main(args: Array<String>) {
    val (N, M) = readInts()
    val ka = (0 until N).map { readInts() }
    val map = (1..M).map { it to 0 }.toMutableMap()

    for (line in ka) {
        for (a in line.drop(1)) map[a] = map[a]!! + 1
    }

    println(map.filter { it.value == N }.size)
}