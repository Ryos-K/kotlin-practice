import java.util.BitSet

private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs

fun main() {
	Solver().solve()
}

class Solver {
	val n: Int = readInt()
	val d = Array(n) { IntArray(n) }.also {
		for (i in 0..<n - 1) for (j in i + 1..<n) {
			it[i][j] = readInt()
			it[j][i] = it[i][j]
		}
	}

	fun solve() {

	}

	val memo = mutableMapOf<BitSet, Long>().apply {
		for (i in 0..<n - 1) for (j in i + 1..<n) {
			set(BitSet().apply { set(i); set(j) }, d[i][j].toLong())
		}
	}

	private fun _solve(bitSet: BitSet): Long {
		if (memo.containsKey(bitSet)) return memo[bitSet]!!
		if (bitSet.cardinality() % 2 == 1) {
			var next = bitSet.nextSetBit(0)
			var maxCost = 0
			while (next != -1) {

				maxCost = max(maxCost, _solve(bitSet.apply { clear(next) }
			}))

			next = bitSet.nextSetBit(next + 1)
		}
	}
}


}