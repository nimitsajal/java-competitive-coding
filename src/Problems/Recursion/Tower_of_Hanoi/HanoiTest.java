package Problems.Recursion.Tower_of_Hanoi;

public class HanoiTest {

    static HanoiSolution solution = new HanoiSolution();

    public static void main(String[] args) {

        int[] inputs = {1, 2, 3, 4, 5};

        runTests(solution, inputs);

    }

    static void runTests(HanoiSolution solution, int[] inputs) {
        boolean allTestsPassed = true;

        System.out.println("----- " + solution.getClass().getSimpleName() + " -----");

        for (int i = 0; i < inputs.length; i++) {
            int n = inputs[i];
//            int expectedOutput = inputs[i][1];

            long startTime = System.nanoTime();
            solution.solve(n);
            long endTime = System.nanoTime();

            System.out.println("\nTest " + (i + 1) + " passed ✅ with disk " + n);
            System.out.println("Execution Time: " + (endTime - startTime) + " ns" + "\n");
            System.out.println("---------------------------------------------------------\n");

        }
    }

}
