package Problems.Recursion.Sum_of_n_numbers;

public class Sum_of_n_numbers_IterationSolution implements SumOfNNumbersSolutionInterface {

     public int getSum(int n) {
        return getSumOfNNumbersByIteration(n);
    }

    private int getSumOfNNumbersByIteration(int n) {

        int result = 0;

        for(int i = 1; i <= n; i++) {
            result += i;
        }

        return result;

    }

}
