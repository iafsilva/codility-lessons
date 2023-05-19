package lesson3

/**
 * An array A consisting of N different integers is given.
 *
 * The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 *     fun solution(A: IntArray): Int
 *
 * that, given an array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 * ```
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * ```
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * - N is an integer within the range [0..100,000];
 * - the elements of A are all distinct;
 * - each element of array A is an integer within the range [1..(N + 1)].
 */
class MissingPermElem {

    fun solution(a: IntArray): Int {
        // First edge case: missing is the first nr
        if (a.isEmpty()) return 1

        a.sort()

        for (i in a.indices) {
            // Index 0 must be 1, Index 1 must be 2, and so on.
            // Whenever that's not true, we found our missing nr
            if (a[i] != i + 1) return i + 1
        }

        // Second edge case: missing is the last nr
        return a.size + 1
    }
}

