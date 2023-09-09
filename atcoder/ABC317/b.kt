private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
fun main() {
	val n = readInt()
	val a = readInts().sorted()

	for (i in 1..(a.size-1)) {
		if (a[i - 1] + 1 != a[i]) {
			println(a[i]- 1)
			break
		}
	}
}
