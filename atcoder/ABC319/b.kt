private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs

fun main() {
	val n = readInt()
	val divisors = mutableListOf<Int>().apply {
		(1..9).forEach { j ->
			if (n % j == 0) add(j)
		}
	}.toList()
	val sb = StringBuilder()
	repeat(n + 1) { i ->
		divisors.forEach { j ->
			if (i * j % n == 0) {
				sb.append(j)
				return@repeat
			}

		}
		sb.append('-')
	}
	println(sb.toString())
}
