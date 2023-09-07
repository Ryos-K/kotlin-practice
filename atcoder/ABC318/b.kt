private fun readStr() = readLine()!! // string line

private fun readInt() = readStr().toInt() // single int

private fun readStrings() = readStr().split(" ") // list of strings

private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    val field = Array(101) { Array(101) { 0 } }
    val n = readInt()
    repeat(n) {
        val (x1, x2, y1, y2) = readInts()
        field[x1][y1]++
        field[x1][y2]--
        field[x2][y1]--
        field[x2][y2]++
    }

    repeat(100) { x -> repeat(100) { y -> field[x + 1][y] += field[x][y] } }
    repeat(100) { x -> repeat(100) { y -> field[x][y + 1] += field[x][y] } }

    var cnt = 0
    field.forEach { row -> row.forEach { if (it > 0) cnt++ } }
    println(cnt)
}
