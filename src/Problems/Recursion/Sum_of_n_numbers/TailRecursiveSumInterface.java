package Problems.Recursion.Sum_of_n_numbers;

@FunctionalInterface
interface TailRecursiveSumInterface {
    /****
 * Computes the sum of the first n natural numbers using recursion.
 *
 * @param self the recursive function instance, enabling recursive calls
 * @param n the number up to which the sum is calculated
 * @return the sum of the first n natural numbers
 */
    int getSum(TailRecursiveSumInterface self, int n, int acc);
}
