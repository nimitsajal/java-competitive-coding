package Problems.Recursion.Sum_of_n_numbers;

public class Sum_of_n_numbers_TailRecursionSolution implements SumOfNNumbersSolutionInterface {

    /**
     * Calculates the sum of the first n natural numbers using tail recursion.
     *
     * @param n the number of natural numbers to sum; must be positive
     * @return the sum of the first n natural numbers
     */
    public int getSum(int n) {
        return getSumOfNNumbersByRecursion(n, 0);
    }

    /**
     * Computes the sum of the first n natural numbers using tail recursion with an accumulator.
     *
     * @param n the current number to add; should be a non-negative integer
     * @param acc the accumulator holding the running total
     * @return the sum of all natural numbers from 1 to n
     */
    private int getSumOfNNumbersByRecursion(int n, int acc) {

        if (n == 0) {
            return acc;
        }

        return getSumOfNNumbersByRecursion(n-1, n+acc);

    }

}
