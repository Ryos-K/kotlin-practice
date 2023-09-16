private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs

fun main() {
	val n = readInt()
	val betListOf = List(n) {
		val c = readInt()
		Pair(it + 1, readInts())
	}
	val x = readInt()

	val filteredList = betListOf
		.filter { betList -> betList.second.contains(x) }
		.sortedBy { betList -> betList.second.size }

	val sb = StringBuilder()

	if (filteredList.isEmpty()) {
		sb.append(0)
	} else {
		filteredList.filter { it.second.size == filteredList[0].second.size }.let {
			sb.appendLine(it.size)
			sb.append(it.map { pair ->  pair.first }.joinToString(" "))
		}
	}
	println(sb.toString())
}
