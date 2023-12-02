package day1

fun day1Part1(input: String): Int {
    val output = input.split("\n")
        .map { line ->
            line.toCharArray()
                .filter { it.isDigit() }

        }
        .map { it -> charArrayOf(it.first(), it.last()) }
        .map { it.joinToString("") }.sumOf { it.toInt() }

    println(output)
    return output
}
