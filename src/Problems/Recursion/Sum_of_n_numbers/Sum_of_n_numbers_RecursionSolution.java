package Problems.Recursion.Sum_of_n_numbers;

public class Sum_of_n_numbers_RecursionSolution implements SumOfNNumbersSolutionInterface {

    /**
     * Returns the sum of the first n natural numbers using recursion.
     *
     * @param n the number of terms to sum; should be a positive integer
     * @return the sum of the first n natural numbers
     */
    public int getSum(int n) {
        return getSumOfNNumbersByRecursion(n);
    }

    /**
     * Recursively calculates the sum of the first n natural numbers.
     *
     * @param n the number of terms to sum; should be a positive integer
     * @return the sum of all natural numbers from 1 to n
     */
    private int getSumOfNNumbersByRecursion(int n) {

        if (n == 1) {
            return 1;
        }

        return n + getSumOfNNumbersByRecursion(n - 1);

    }

}
