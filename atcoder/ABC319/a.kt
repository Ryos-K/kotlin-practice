private fun readStr() = readLine()!! // string line
private fun readInt() = readStr().toInt() // single int
private fun readLong() = readStr().toLong() // single long
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs

fun main() {
	val s = readStr()
	val rateOf = mapOf(
		"tourist" to 3858,
		"ksun48" to 3679,
		"Benq" to 3658,
		"Um_nik" to 3648,
		"apiad" to 3638,
		"Stonefeang" to 3630,
		"ecnerwala" to 3613,
		"mnbvmar" to 3555,
		"newbiedmy" to 3516,
		"semiexp" to 3481,
	)
	println(rateOf[s])
}
