package library

private const val INF = (1e9 + 7).toInt()
private fun solveFloydWarshall(graph: Array<Array<Int>>, hasWeight: Boolean = false): Array<Array<Int>> {
    val M = graph.size
    val N = graph[0].size
    val adj = Array(M) { Array(N) { INF } }

    for (k in 0 until N) for (m in 0 until M) for (n in 0 until N) {
        adj[m][n] = Math.min(adj[m][n], adj[m][k] + adj[k][n])
    }

    return adj
}