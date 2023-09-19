private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun <A, B> readPair(first: (String) -> A, second: (String) -> B) =
	with(readStrings()) { first(get(0)) to second(get(1)) } // single pair
private fun <A, B, C> readTriple(first: (String) -> A, second: (String) -> B, third: (String) -> C) =
	with(readStrings()) { Triple(first(get(0)), second(get(1)), third(get(2))) } // single triple

fun main() {}
