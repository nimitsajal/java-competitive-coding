package Problems.Recursion.Fibonacci_sequence;

public class FibonacciSequenceHeadSolution implements FibonacciSolutionInterface{

    /**
     * Returns the nth Fibonacci number using a recursive approach.
     *
     * @param n the position in the Fibonacci sequence (starting from 0)
     * @return the nth Fibonacci number
     */
    @Override
    public int getFibonacci(int n) {
        return getFibonacciHead(n);
    }

    /**
     * Recursively computes the nth Fibonacci number.
     *
     * @param n the position in the Fibonacci sequence (0-based)
     * @return the nth Fibonacci number
     *
     * For n = 0, returns 0; for n = 1, returns 1; for n > 1, returns the sum of the two preceding Fibonacci numbers.
     */
    private int getFibonacciHead(int n) {

        // base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // recursion
        int res1 = getFibonacciHead(n-1);
        int res2 = getFibonacciHead(n-2);

        // action
        return res1 + res2;
    }
}
