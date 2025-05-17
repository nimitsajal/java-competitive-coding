package Problems.Recursion.Sum_of_n_numbers;

@FunctionalInterface
interface SumOfNNumbersSolutionInterface {
    /****
 * Calculates the sum of all integers from 1 to the specified number.
 *
 * @param n the upper bound of the range to sum
 * @return the sum of integers from 1 to n
 */
int getSum(int n);
}
