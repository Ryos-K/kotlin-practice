private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs

fun main() {
	val n = readInt()
	println( PI_STRING.slice(0..(n + 1)))
}

const val PI_STRING = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"