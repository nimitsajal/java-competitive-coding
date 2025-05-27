package Problems.Recursion.Gcd_euclidean;

public class GcdEuclideanTest {

    static GcdEuclideanSolutionInterface solutionClass = new GcdEuclideanSolutionClass();

    static GcdEuclideanSolutionInterface solutionLambda = (int a, int b) -> {
        GcdEuclideanRecursionInterface recursive = (self, x, y) -> {
            if (x==0 && y==0) {
                return 0;
            } else if (x==0) {
                return y;
            } else if (y==0) {
                return x;
            } else {
                if (x<0) {
                    x *= -1;
                }
                if (y<0) {
                    y *= -1;
                }

                return x%y==0 ? y : self.getGcd(self, y, x%y);
            }
        };
        return recursive.getGcd(recursive, a, b);
    };

    public static void main(String[] args) {

        int[][] inputs = {
                // Basic positive integers
                {45, 10, 5},
                {100, 25, 25},
                {81, 27, 27},

                // Co-prime numbers (GCD should be 1)
                {17, 29, 1},
                {35, 64, 1},

                // One number is a multiple of the other
                {60, 20, 20},
                {14, 7, 7},

                // One input is 0 (GCD of any number and 0 is the absolute value of the other number)
                {0, 5, 5},
                {7, 0, 7},
                {0, 0, 0}, // Edge case: both are 0 (undefined or 0 depending on implementation)

                // Negative numbers (GCD should be positive)
                {-45, 15, 15},
                {18, -6, 6},
                {-24, -36, 12},

                // Identical numbers
                {42, 42, 42},

                // One or both are 1
                {1, 1, 1},
                {1, 99, 1},
                {87, 1, 1},

                // Large numbers
                {123456, 789012, 12},
                {1000000, 250000, 250000}
        };


        runTests(solutionClass, inputs);
        runTests(solutionLambda, inputs);

    }

    private static void runTests(GcdEuclideanSolutionInterface solution, int[][] inputs) {

        boolean allTestsPassed = true;

        System.out.println("----- " + solution.getClass().getSimpleName() + " -----");

        for (int i = 0; i < inputs.length; i++) {
            int a = inputs[i][0];
            int b = inputs[i][1];
            int expectedOutput = inputs[i][2];

            long startTime = System.nanoTime();
            int result = solution.getGcd(a, b);
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
