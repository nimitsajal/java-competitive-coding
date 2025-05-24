package Problems.Recursion.Fibonacci_sequence;

public class FibonacciTest {

    static FibonacciSequenceHeadSolution headRecursionSolutionClass = new FibonacciSequenceHeadSolution();

    static FibonacciSequenceTailSolution tailRecursionSolutionClass = new FibonacciSequenceTailSolution();

    static FibonacciSolutionInterface headRecursionSolutionLambda = (int n) -> {
        FibonacciHeadSolutionInterface recursive = (FibonacciHeadSolutionInterface self, int m) -> {
            if (m == 0) return 0;
            if (m == 1) return 1;
            return self.getFibonacci(self, m-1) + self.getFibonacci(self, m-2);
        };
        return recursive.getFibonacci(recursive, n);
    };

    static FibonacciSolutionInterface tailRecursionSolutionLambda = (int n) -> {
        FibonacciTailSolutionInterface recursive = (FibonacciTailSolutionInterface self, int m, int a, int b) -> {
            if (m == 0) return a;
            if (m == 1) return b;
            return self.getFibonacci(self, m-1, b, a+b);
        };
        return recursive.getFibonacci(recursive, n, 0, 1);
    };

    public static void main(String[] args) {

        // define test cases
        int[][] inputs = {
                {0, 0},
                {1, 1},
                {2, 1},
                {3, 2},
                {4, 3},
                {5, 5},
                {6, 8},
                {7, 13},
                {8, 21},
                {9, 34},
                {10, 55},
                {11, 89},
                {12, 144},
                {13, 233},
                {14, 377},
                {15, 610},
                {20, 6765}
        };

        runTests(headRecursionSolutionClass, inputs);
        runTests(tailRecursionSolutionClass, inputs);
        runTests(headRecursionSolutionLambda, inputs);
        runTests(tailRecursionSolutionLambda, inputs);

    }

    private static void runTests(FibonacciSolutionInterface solution, int[][] inputs) {
        boolean allTestsPassed = true;

        System.out.println("----- " + solution.getClass().getSimpleName() + " -----");

        for (int i = 0; i < inputs.length; i++) {
            int n = inputs[i][0];
            int expectedOutput = inputs[i][1];

            long startTime = System.nanoTime();
            int result = solution.getFibonacci(n);
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
