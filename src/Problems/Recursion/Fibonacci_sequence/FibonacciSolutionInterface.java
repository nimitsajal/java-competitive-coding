package Problems.Recursion.Fibonacci_sequence;

@FunctionalInterface
public interface FibonacciSolutionInterface {
    /**
 * Computes the Fibonacci number at the specified position.
 *
 * @param n the position in the Fibonacci sequence (zero-based)
 * @return the Fibonacci number at position n
 */
int getFibonacci(int n);
}
