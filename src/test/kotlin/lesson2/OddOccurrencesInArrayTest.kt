package lesson2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OddOccurrencesInArrayTest {

    @Suppress("PrivatePropertyName")
    private val SUT = OddOccurrencesInArray()

    @Test
    fun oddOccurrencesInArray_singleValue_returnValue() {
        val result = SUT.solution(intArrayOf(1))
        Assertions.assertTrue(result == 1)
    }

    @Test
    fun oddOccurrencesInArray_demoTest_return7() {
        val solution = SUT.solution(intArrayOf(9, 3, 9, 3, 9, 7, 9))
        Assertions.assertTrue(solution == 7)
    }

    @Test
    fun oddOccurrencesInArray_maxNumbers_return3() {
        val pairedOnes = IntArray(499998) { 1 }
        val pairedTwos = IntArray(499998) { 2 }
        val unpairedThree = 3

        val result = SUT.solution(pairedOnes.plus(unpairedThree).plus(pairedTwos))
        Assertions.assertTrue(result == 3)
    }
}