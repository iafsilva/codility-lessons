package lesson2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CyclicRotationTest {

    @Suppress("PrivatePropertyName")
    private val SUT = CyclicRotation()

    @Test
    fun cyclicRotation_emptyArray_returnEmptyArray() {
        val result = SUT.solution(intArrayOf(), 0)
        Assertions.assertArrayEquals(result, intArrayOf())
    }

    @Test
    fun cyclicRotation_noRotation_returnSameArray() {
        val result = SUT.solution(intArrayOf(), 0)
        Assertions.assertArrayEquals(result, intArrayOf())
    }

    @Test
    fun cyclicRotation_rotationEqualsToSize_returnSameArray() {
        val a = intArrayOf(1, 2, 3)
        val result = SUT.solution(a, 3)
        Assertions.assertSame(result, a)
    }

    @Test
    fun cyclicRotation_rotationBiggerThanSize_returnRotated() {
        val result = SUT.solution(intArrayOf(1, 2, 3), 5)
        Assertions.assertArrayEquals(result, intArrayOf(2, 3, 1))
    }

    @Test
    fun cyclicRotation_rotationSmallerThanSize_returnRotated() {
        val result = SUT.solution(intArrayOf(1, 2, 3), 2)
        Assertions.assertArrayEquals(result, intArrayOf(2, 3, 1))
    }

    @Test
    fun cyclicRotation_maxArrayMaxRotationMinus1_returnRotated() {
        val result = SUT.solution(IntArray(100) { i -> i + 1 }, 99)
        Assertions.assertArrayEquals(result, IntArray(100) { i -> if (i == 99) 1 else i + 2 })
    }

    @Test
    fun cyclicRotation_maxArrayMinRotation_returnRotated() {
        val result = SUT.solution(IntArray(100) { i -> i + 1 }, 1)
        Assertions.assertArrayEquals(result, IntArray(100) { i -> if (i == 0) 100 else i })
    }

    @Test
    fun cyclicRotation_differentRotations_returnSameRotatedArray() {
        val result1 = SUT.solution(IntArray(100) { i -> i + 1 }, 1)
        val result2 = SUT.solution(IntArray(100) { i -> i + 1 }, 101)
        Assertions.assertArrayEquals(result1, result2)
    }

}