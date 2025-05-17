package Problems.Recursion.Sum_of_n_numbers;

public class Sum_of_n_numbers_Test {

    static Sum_of_n_numbers_IterationSolution iterationSolutionClass = new Sum_of_n_numbers_IterationSolution();
    static Sum_of_n_numbers_RecursionSolution recursionSolutionClass = new Sum_of_n_numbers_RecursionSolution();

    static SumOfNNumbersSolutionInterface iterationSolutionLambda = (int n) -> {
        int res = 0;
        for (int i=1; i<=n; i++) {res += i;}
        return res;
    };

    static SumOfNNumbersSolutionInterface recursionSolutionLambda = (int n) -> {
        RecursiveSumInterface recursive = (RecursiveSumInterface self, int m) -> {
            return m == 1 ? 1 : m + self.getSum(self, m-1);
        };
        return recursive.getSum(recursive, n);
    };

    public static void main(String[] args) {


        int[][] inputs = {
                {3, 6},
                {5, 15},
                {10, 55}
        };

        runTests(iterationSolutionClass, inputs);
        runTests(recursionSolutionClass, inputs);
        runTests(iterationSolutionLambda, inputs);
        runTests(recursionSolutionLambda, inputs);

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
