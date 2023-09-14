private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs

fun main() {
	val n = readInt()
	val satisfactionOf: List<List<Int>> = MutableList<MutableList<Int>>(n) { mutableListOf() }.apply {
		repeat(n) {
			val (f, s) = readInts()
			get(f - 1).add(s)
		}
		repeat(n) {
			get(it).sortDescending()
		}
		sortByDescending { selector -> selector.getOrNull(0) ?: 0 }
	}
	val ans = maxOf(
		satisfactionOf[0][0] + ((satisfactionOf[0].getOrNull(1) ?: 0) / 2),
		satisfactionOf[0][0] + ((satisfactionOf.getOrNull(1)?.getOrNull(0) ?: 0))
	)

	println(ans)
}