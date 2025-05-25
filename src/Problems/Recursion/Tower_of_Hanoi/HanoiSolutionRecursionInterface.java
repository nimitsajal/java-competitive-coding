package Problems.Recursion.Tower_of_Hanoi;

import java.util.concurrent.atomic.AtomicInteger;

@FunctionalInterface
public interface HanoiSolutionRecursionInterface {
    /****
 * Recursively solves the Tower of Hanoi problem for a given number of disks.
 *
 * @param self reference to the interface instance, used for recursive invocation
 * @param n the number of disks to move
 * @param s the source peg identifier
 * @param m the auxiliary (middle) peg identifier
 * @param d the destination peg identifier
 * @param moveCounter a thread-safe counter tracking the number of moves performed
 */
void solve(HanoiSolutionRecursionInterface self, int n, char s, char m, char d, AtomicInteger moveCounter);
}
