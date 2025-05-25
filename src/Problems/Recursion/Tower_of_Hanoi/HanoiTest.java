package Problems.Recursion.Tower_of_Hanoi;

import java.util.concurrent.atomic.AtomicInteger;

public class HanoiTest {

    static HanoiSolutionInterface solutionClass = new HanoiSolution();

    static HanoiSolutionInterface solutionLambda = (int n) -> {
      HanoiSolutionRecursionInterface recursive = (self, disk, start, middle, destination, moveCounter) -> {
          if (disk == 0 ) return;
          if (disk < 0 ) {
              System.out.println("Number of disks cannot be negative!");
              return;
          }
          self.solve(self, disk - 1, start, destination, middle, moveCounter);
          System.out.println("Move " + moveCounter.incrementAndGet() + ": Plate " + disk + " from " + start + " to " + destination);
          self.solve(self, disk - 1, middle, start, destination, moveCounter);
      };
//      recursive.solve(recursive, n, 'A', 'B', 'C', new AtomicInteger(0));
      recursive.solve(recursive, n, 'A', 'B', 'C', new AtomicInteger(0));
    };

    public static void main(String[] args) {

        int[] inputs = {1, 2, 3, 4, 5, -4};

        runTests(solutionClass, inputs);
        runTests(solutionLambda, inputs);

    }

    static void runTests(HanoiSolutionInterface solution, int[] inputs) {

        System.out.println("----- " + solution.getClass().getSimpleName() + " -----");

        for (int i = 0; i < inputs.length; i++) {
            int n = inputs[i];

            long startTime = System.nanoTime();
            solution.solve(n);
            long endTime = System.nanoTime();

            System.out.println("\nTest " + (i + 1) + " passed ✅ with disk " + n);
            System.out.println("Execution Time: " + (endTime - startTime) + " ns" + "\n");
            System.out.println("---------------------------------------------------------\n");

        }
    }

}
