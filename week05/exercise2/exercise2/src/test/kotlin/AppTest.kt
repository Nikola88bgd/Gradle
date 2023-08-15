package exercise2

import binarySearch

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class AppTest {
    private val numbers = arrayOf(1, 5, 10, 25, 29, 38, 39, 58, 67, 77, 81, 95)
    private val results = binarySearch(numbers, 29)

    @Test
    fun testingBinary() {
        assertEquals(29, results)
    }

    @Test
    fun testingBinary2() {
        assertTrue(results != -1)
    }

}