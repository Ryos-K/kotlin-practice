private fun readStr() = readLine()!! // string line

private fun readInt() = readStr().toInt() // single int

private fun readLong() = readStr().toLong() // single long

private fun readStrings() = readStr().split(" ") // list of strings

private fun readInts() = readStrings().map { it.toInt() } // list of ints

private fun readLongs() = readStrings().map { it.toLong() } // list of longs

fun main() {
    val (_, d, p) = readInts()
    var cost = 0L
    readLongs().sortedDescending().windowed(d, d, true).map { it.sum() }.forEach {
        if (it > p) cost += p else cost += it
    }
    println(cost)
}
