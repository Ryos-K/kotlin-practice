private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs

fun main() {
	val m = readInt()
	val d = readInts()

	val mid = (d.sum() + 1) / 2

	var month: Int = 1
	var day: Int = 0
	var sum: Int = 0
	for (v in d) {
		if (sum + v >= mid) {
			day = mid - sum
			break
		} else {
			sum += v
			month++
		}
	}
	println("$month $day")
}
