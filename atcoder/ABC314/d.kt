private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun <A, B> readPair(first: (String) -> A, second: (String) -> B) =
	with(readStrings()) { first(get(0)) to second(get(1)) }
private fun <A, B, C> readTriple(first: (String) -> A, second: (String) -> B, third: (String) -> C) =
	with(readStrings()) { Triple(first(get(0)), second(get(1)), third(get(2))) }


fun main() {
	val n = readInt()
	val s = readStr().toCharArray()
	val q = readInt()

	val query = List(q) {
		readTriple(String::toInt, String::toInt, String::first)
	}
	val lastIndex = query.indexOfLast { it.first in setOf(2, 3) }
	query.filterIndexed { index, triple ->
		(index == lastIndex) or (triple.first == 1)
	}.forEach { triple ->
		when (triple.first) {
			1 -> s[triple.second - 1] = triple.third
			2 -> repeat(s.size) { s[it] = s[it].lowercaseChar() }
			3 -> repeat(s.size) { s[it] = s[it].uppercaseChar() }
		}
	}

	println(s)
}

