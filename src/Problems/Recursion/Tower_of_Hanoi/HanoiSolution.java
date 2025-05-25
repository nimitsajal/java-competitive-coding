package Problems.Recursion.Tower_of_Hanoi;

import java.util.concurrent.atomic.AtomicInteger;

public class HanoiSolution {

    public void solve(int n) {
        hanoi(n, 'A', 'B', 'C', new AtomicInteger(0));
    }

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
