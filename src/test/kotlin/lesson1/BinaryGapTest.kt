package lesson1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BinaryGapTest {

    @Suppress("PrivatePropertyName")
    private val SUT = BinaryGap()

    @Test
    fun binaryGap_shortGap_return2() {
        val result = SUT.solution(9)
        Assertions.assertTrue(result == 2)
    }

    @Test
    fun binaryGap_noGapOn15_return0() {
        val result = SUT.solution(15)
        Assertions.assertTrue(result == 0)
    }

    @Test
    fun binaryGap_noGapOn32_return0() {
        val result = SUT.solution(32)
        Assertions.assertTrue(result == 0)
    }

    @Test
    fun binaryGap_shortGap_return1() {
        val result = SUT.solution(20)
        Assertions.assertTrue(result == 1)
    }

    @Test
    fun binaryGap_shortGap_return4() {
        val result = SUT.solution(529)
        Assertions.assertTrue(result == 4)
    }

    @Test
    fun binaryGap_shortGap_return5() {
        val result = SUT.solution(1041)
        Assertions.assertTrue(result == 5)
    }

    @Test
    fun binaryGap_bigGap_return29() {
        val result = SUT.solution(1073741825)
        Assertions.assertTrue(result == 29)
    }

    @Test
    fun binaryGap_bigGap_return25() {
        val result = SUT.solution(805306373)
        Assertions.assertTrue(result == 25)
    }

}