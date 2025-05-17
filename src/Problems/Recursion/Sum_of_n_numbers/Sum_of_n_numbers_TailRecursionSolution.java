package Problems.Recursion.Sum_of_n_numbers;

public class Sum_of_n_numbers_TailRecursionSolution implements SumOfNNumbersSolutionInterface {

    /**
     * Returns the sum of the first n natural numbers using recursion.
     *
     * @param n the number of terms to sum; should be a positive integer
     * @return the sum of the first n natural numbers
     */
    public int getSum(int n) {
        return getSumOfNNumbersByRecursion(n, 0);
    }

    /**
     * Recursively calculates the sum of the first n natural numbers.
     *
     * @param n the number of terms to sum; should be a positive integer
     * @return the sum of all natural numbers from 1 to n
     */
    private int getSumOfNNumbersByRecursion(int n, int acc) {

        if (n == 0) {
            return 0;
        }

        return getSumOfNNumbersByRecursion(n-1, n+acc);

    }

}
