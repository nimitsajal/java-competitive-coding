package Problems.Recursion.Sum_of_n_numbers;

public class Sum_of_n_numbers_RecursionSolution implements SumOfNNumbersSolutionInterface {

    public int getSum(int n) {
        return getSumOfNNumbersByRecursion(n);
    }

    private int getSumOfNNumbersByRecursion(int n) {

        if (n == 1) {
            return 1;
        }

        return n + getSumOfNNumbersByRecursion(n - 1);

    }

}
