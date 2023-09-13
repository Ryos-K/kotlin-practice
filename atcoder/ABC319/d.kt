private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs

fun main() {
	val (n, m) = readInts()
	val l = readLongs()

	var wMax = l.sum() + n - 1
	var wMin = l.min()
	var wMid = (wMax + wMin) / 2
	var row = 0
	val next: () -> Boolean = {
		wMid = (wMin + wMax) / 2
		row = countRow(l, wMid)
		if (row == m) {
			false
		} else if (row < m) {
			wMax = wMid - 1
			true
		} else {
			wMin = wMid + 1
			true
		}
	}
	while (next()) {
	}

	println(wMid)
}

fun countRow(l: List<Long>, w: Long): Int {
	var row = 1
	l.reduce { sum, value ->
		if (sum + value + 1 > w) {
			row++
			value
		} else {
			sum + value + 1
		}
	}
	return row
}
