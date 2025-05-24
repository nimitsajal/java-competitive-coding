package Problems.Recursion.Fibonacci_sequence;

@FunctionalInterface
public interface FibonacciHeadSolutionInterface {
    /****
 * Computes the nth Fibonacci number using the provided interface instance for recursion.
 *
 * @param self the interface instance used to enable recursive calls
 * @param n the position in the Fibonacci sequence to compute
 * @return the nth Fibonacci number
 */
int getFibonacci(FibonacciHeadSolutionInterface self, int n);
}
