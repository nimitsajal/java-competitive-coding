package Problems.Recursion.Fibonacci_sequence;

public class FibonacciSequenceTailSolution implements FibonacciSolutionInterface{

    /**
     * Computes the nth Fibonacci number using a tail-recursive approach.
     *
     * @param n the index of the Fibonacci number to compute, where n >= 0
     * @return the nth Fibonacci number
     */
    @Override
    public int getFibonacci(int n) {
        return getFibonacciTail(n, 0, 1);
    }

    /****
     * Computes the nth Fibonacci number using tail recursion with accumulator parameters.
     *
     * @param n the position in the Fibonacci sequence to compute
     * @param a the accumulator holding the (n-2)th Fibonacci number
     * @param b the accumulator holding the (n-1)th Fibonacci number
     * @return the nth Fibonacci number
     */
    private int getFibonacciTail(int n, int a, int b) {

        // base cases
        if (n == 0) return a;
        if (n == 1) return b;


        return getFibonacciTail(n-1, b, a+b);
    }
}
