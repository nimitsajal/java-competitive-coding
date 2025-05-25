package Problems.Recursion.Tower_of_Hanoi;

@FunctionalInterface
public interface HanoiSolutionInterface {
    /****
 * Solves the Tower of Hanoi problem for the specified number of disks.
 *
 * @param n the number of disks to move in the Tower of Hanoi puzzle
 */
void solve(int n);
}
