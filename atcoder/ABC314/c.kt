private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs

fun main() {
	val (n, m) = readInts()
	val s = readStr()
	val c = readInts().map {it - 1}
	val textColored = s.toCharArray() zip c

	val queueOfColor = List(m) { ArrayDeque<Char>() }.also { list ->
		textColored.forEach { (char, color) -> list[color].add(char) }
	}

	// rotate
	queueOfColor.forEach { it.addFirst(it.last()); it.removeLast() }

	c.forEach { i ->
		print(queueOfColor[i].first())
		queueOfColor[i].removeFirst()
	}
}
