private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs



fun main() {
	val (n, m) = readInts()
	val graph = Array(n) { arrayListOf<Int>() }
	val dist = mutableMapOf<Pair<Int, Int>, Int>()

	repeat(m) {
		val (a, b, c) = readInts()
		graph[a - 1].add(b - 1)
		graph[b - 1].add(a - 1)
		dist[Pair(a - 1, b - 1)] = c
		dist[Pair(b - 1, a - 1)] = c
	}

	Solver(n,m,graph, dist)
}

class Solver(
	val n: Int,
	val m: Int,
	val graph: Array<ArrayList<Int>>,
	val dist: Map<Pair<Int, Int>, Int>
) {
	fun solve() {

	}

	private fun dfs(current: Int, reached: MutableSet<Int>): Int {
		for (next in graph[current]) {
			if (next in reached) continue
			reached.add(next)
		}
	}
}