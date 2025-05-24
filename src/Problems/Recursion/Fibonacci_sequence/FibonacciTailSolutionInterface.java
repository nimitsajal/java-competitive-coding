package Problems.Recursion.Fibonacci_sequence;

@FunctionalInterface
public interface FibonacciTailSolutionInterface {
    /****
 * Computes the nth Fibonacci number using a tail-recursive approach.
 *
 * @param self reference to the current FibonacciTailSolutionInterface instance, enabling recursive calls
 * @param n the position in the Fibonacci sequence to compute
 * @param a the accumulator representing the current Fibonacci value
 * @param b the accumulator representing the next Fibonacci value
 * @return the nth Fibonacci number
 */
int getFibonacci(FibonacciTailSolutionInterface self, int n, int a, int b);
}
