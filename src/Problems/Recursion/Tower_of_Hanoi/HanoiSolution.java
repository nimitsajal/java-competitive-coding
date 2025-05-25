package Problems.Recursion.Tower_of_Hanoi;

import java.util.concurrent.atomic.AtomicInteger;

public class HanoiSolution implements HanoiSolutionInterface{

    /**
     * Solves the Tower of Hanoi problem for the specified number of disks and prints each move.
     *
     * @param n the number of disks to move from the source rod to the destination rod
     */
    public void solve(int n) {
        hanoi(n, 'A', 'B', 'C', new AtomicInteger(0));
    }

    /**
     * Recursively solves the Tower of Hanoi problem for a given number of disks, printing each move and incrementing the move counter.
     *
     * @param disk        the number of disks to move
     * @param source      the rod from which disks are moved
     * @param middle      the auxiliary rod used during the process
     * @param destination the rod to which disks are moved
     * @param moveCounter a counter tracking the total number of moves performed
     */
    private void hanoi(int disk, char source, char middle, char destination, AtomicInteger moveCounter) {

        // base case
        if (disk == 0) {
            return;
        }

        // recursion 1 - to move n-1 disks from source to middle using destination
        // to eliminate the largest disk from others - move others to the middle rod
        hanoi(disk-1, source, middle, destination, moveCounter);

//        moveCounter.incrementAndGet();
        System.out.println("Move " + moveCounter.incrementAndGet() + " : Plate " + disk + " from " + source + " to " + destination);

        // recursion 1 - to move n-1 disks from middle to destination using source
        hanoi(disk-1, middle, source, destination, moveCounter);

    }

}
