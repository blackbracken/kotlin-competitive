package template

import java.util.*

private fun readInts() = readLine()!!.split(" ").map { it.toInt() }
private fun readLongs() = readLine()!!.split(" ").map { it.toLong() }
private fun <K, V> Map<out K, V>.toMutableMap(): MutableMap<K, V> = LinkedHashMap(this)
private fun <K, V> mutableMapOf(): MutableMap<K, V> = LinkedHashMap()
private fun <K, V> mutableMapOf(vararg pairs: Pair<K, V>) = pairs.toMap().toMutableMap()

fun main(args: Array<String>) {
}