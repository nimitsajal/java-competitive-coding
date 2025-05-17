package Problems.Recursion.Sum_of_n_numbers;

@FunctionalInterface
interface HeadRecursiveSumInterface {
    /****
 * Calculates the sum of the first n natural numbers using head recursion.
 *
 * @param self the interface instance used for recursive invocation
 * @param n the upper bound of the summation
 * @return the sum of all natural numbers from 1 to n
 */
int getSum(HeadRecursiveSumInterface self, int n);
}
