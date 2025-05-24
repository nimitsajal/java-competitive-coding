package Problems.Recursion.Fibonacci_sequence;

public class FibonacciSequenceHeadSolution implements FibonacciSolutionInterface{

    @Override
    public int getFibonacci(int n) {
        return getFibonacciHead(n);
    }

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
