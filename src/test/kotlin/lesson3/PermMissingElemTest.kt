package lesson3

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PermMissingElemTest {

    @Suppress("PrivatePropertyName")
    private val SUT = PermMissingElem()

    @Test
    fun permMissingElem_emptyArray_return1() {
        val result = SUT.solution(intArrayOf())
        Assertions.assertEquals(1, result)
    }

    @Test
    fun permMissingElem_missingFirstNr_return1() {
        val result = SUT.solution(intArrayOf(2, 3, 4, 5))
        Assertions.assertEquals(1, result)
    }

    @Test
    fun permMissingElem_missingLastNr_return5() {
        val result = SUT.solution(intArrayOf(1, 2, 3, 4))
        Assertions.assertEquals(5, result)
    }

    @Test
    fun permMissingElem_maxArrayMissingLastElement_return100_001() {
        val result = SUT.solution(IntArray(100_000) { i -> i + 1 })
        Assertions.assertEquals(100_001, result)
    }

    @Test
    fun permMissingElem_maxArrayMissingMiddleElement_return50_000() {
        val result = SUT.solution(IntArray(100_000) { i -> if (i == 50_000) Int.MAX_VALUE else i + 1 })
        Assertions.assertEquals(50_001, result)
    }

}