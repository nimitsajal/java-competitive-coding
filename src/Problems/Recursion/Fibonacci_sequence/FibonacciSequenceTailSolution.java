package Problems.Recursion.Fibonacci_sequence;

public class FibonacciSequenceTailSolution implements FibonacciSolutionInterface{

    @Override
    public int getFibonacci(int n) {
        return getFibonacciTail(n, 0, 1);
    }

    private int getFibonacciTail(int n, int a, int b) {

        // base cases
        if (n == 0) return a;
        if (n == 1) return b;


        return getFibonacciTail(n-1, b, a+b);
    }
}
