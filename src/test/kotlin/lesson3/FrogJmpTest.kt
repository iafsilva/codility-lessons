package lesson3

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FrogJmpTest {

    @Suppress("PrivatePropertyName")
    private val SUT = FrogJmp()

    @Test
    fun frogJmp_noJump_return0() {
        val result = SUT.solution(1, 1, 1)
        Assertions.assertEquals(0, result)
    }

    @Test
    fun frogJmp_exactJump_return1() {
        val result = SUT.solution(1, 2, 1)
        Assertions.assertEquals(1, result)
    }

    @Test
    fun frogJmp_superJump_return1() {
        val result = SUT.solution(10, 999_999_999, 999_999_998)
        Assertions.assertEquals(1, result)
    }

    @Test
    fun frogJmp_demoSolution_return3() {
        val result = SUT.solution(10, 85, 30)
        Assertions.assertEquals(3, result)
    }

    @Test
    fun frogJmp_maxJumps_return999_999_999() {
        val result = SUT.solution(1, 1_000_000_000, 1)
        Assertions.assertEquals(999_999_999, result)
    }

}