package Problems.Recursion.Sum_of_n_numbers;

public class Sum_of_n_numbers_IterationSolution implements SumOfNNumbersSolutionInterface {

     /**
     * Returns the sum of the first n natural numbers using an iterative approach.
     *
     * @param n the number of terms to sum
     * @return the sum of all natural numbers from 1 to n
     */
    public int getSum(int n) {
        return getSumOfNNumbersByIteration(n);
    }

    /**
     * Calculates the sum of the first n natural numbers using an iterative approach.
     *
     * @param n the number of terms to sum
     * @return the sum of all natural numbers from 1 to n
     */
    private int getSumOfNNumbersByIteration(int n) {

        int result = 0;

        for(int i = 1; i <= n; i++) {
            result += i;
        }

        return result;

    }

}
