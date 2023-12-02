package day1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day1KtTest {

    @Test
    fun day1Part1() {
        assertEquals(
            142, day1Part1(
                """
                1abc2
                pqr3stu8vwx
                a1b2c3d4e5f
                treb7uchet
                """.trimIndent()
            )
        )
    }
}