package Problems.Recursion.Sum_of_n_numbers;

public class Sum_of_n_numbers_Test {

    // initializing the dedicated solution class for iterative solution
    static Sum_of_n_numbers_IterationSolution iterationSolutionClass = new Sum_of_n_numbers_IterationSolution();

    // initializing the dedicated solution class for head recursive solution
    static Sum_of_n_numbers_HeadRecursionSolution headRecursionSolutionClass = new Sum_of_n_numbers_HeadRecursionSolution();

    // initializing the dedicated solution class for tail recursive solution
    static Sum_of_n_numbers_TailRecursionSolution tailRecursionSolutionClass = new Sum_of_n_numbers_TailRecursionSolution();

    // implementing a lambda function for iterative solution
    static SumOfNNumbersSolutionInterface iterationSolutionLambda = (int n) -> {
        int res = 0;
        for (int i=1; i<=n; i++) {res += i;}
        return res;
    };

    // implementing a lambda function for recursive solution
    static SumOfNNumbersSolutionInterface headRecursionSolutionLambda = (int n) -> {
        HeadRecursiveSumInterface recursive = (HeadRecursiveSumInterface self, int m) -> {
            return m == 0 ? 0 : m + self.getSum(self, m-1);
        };
        return recursive.getSum(recursive, n);
    };

    static SumOfNNumbersSolutionInterface tailRecursionSolutionLambda = (int n) -> {
        TailRecursiveSumInterface recursive = (TailRecursiveSumInterface self, int m, int acc) -> {
            return m == 0 ? acc : self.getSum(self, m-1, m + acc);
        };
        return recursive.getSum(recursive, n, 0);
    };

    public static void main(String[] args) {


        // defining test cases
        int[][] inputs = {
                {3, 6},
                {5, 15},
                {10, 55}
        };

        runTests(iterationSolutionClass, inputs);
        runTests(headRecursionSolutionClass, inputs);
        runTests(tailRecursionSolutionClass, inputs);
        runTests(iterationSolutionLambda, inputs);
        runTests(headRecursionSolutionLambda, inputs);
        runTests(tailRecursionSolutionLambda, inputs);

    }

    private static void runTests(SumOfNNumbersSolutionInterface solution, int[][] inputs) {

        boolean allTestsPassed = true;

        System.out.println("----- " + solution.getClass().getSimpleName() + " -----");

        for (int i = 0; i < inputs.length; i++) {
            int n = inputs[i][0];
            int expectedOutput = inputs[i][1];

            long startTime = System.nanoTime();
            int result = solution.getSum(n);
            long endTime = System.nanoTime();

            if (result == expectedOutput) {
                System.out.println("Test " + (i + 1) + " passed ✅");
                System.out.println("Expected: " + expectedOutput + ", and got: " + result);
                System.out.println("Execution Time: " + (endTime - startTime) + " ns");
            } else {
                System.out.println("Test " + (i + 1) + " failed ❌");
                System.out.println("Expected: " + expectedOutput + ", but got: " + result);
                System.out.println("Execution Time: " + (endTime - startTime) + " ns");
                allTestsPassed = false;
            }
        }

        if (allTestsPassed) {
            System.out.println("\nAll tests passed! 🎉\n\n");
        } else {
            System.out.println("\nSome tests failed.\n\n");
        }

    }

}
