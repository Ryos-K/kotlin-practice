private fun readStr() = readLine()!! // string line

private fun readInt() = readStr().toInt() // single int

private fun readStrings() = readStr().split(" ") // list of strings

private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    val (n, m, p) = readInts()
    if (n < m) {
        println(0)
        return@main
    }
    println((n - m) / p + 1)
}
