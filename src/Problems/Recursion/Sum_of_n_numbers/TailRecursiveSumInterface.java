package Problems.Recursion.Sum_of_n_numbers;

@FunctionalInterface
interface TailRecursiveSumInterface {
    /****
 * Calculates the sum of the first n natural numbers using tail recursion.
 *
 * @param self the recursive function instance for enabling tail-recursive calls
 * @param n the upper bound of the natural numbers to sum
 * @param acc the accumulator holding the running total during recursion
 * @return the computed sum of the first n natural numbers
 */
    int getSum(TailRecursiveSumInterface self, int n, int acc);
}
