package Problems.Array.BS_Ceiling;

import Problems.Array.BinarySearch.BinarySearchSolution;
import Problems.Array.BS_Ceiling.BS_CeilingSolution;

public class BS_CeilingTest {

    public static void main(String[] args) {

        BS_CeilingSolution bsCeilingSolution = new BS_CeilingSolution();

        int[][][] inputs = {
                // Case 1: Ceiling exists, target not in array
                {
                        {11, 22, 33, 44, 55, 66, 77, 88},
                        {43},
                        {3} // Ceiling is 44 at index 3
                },
                // Case 2: Ceiling exists, target not in array
                {
                        {-10, -5, 0, 5, 10, 15},
                        {1},
                        {3} // Ceiling is 5 at index 3
                },
                // Case 3: Target < smallest element
                {
                        {10, 20, 30},
                        {5},
                        {0} // Ceiling is 10 at index 0
                },
                // Case 4: Target > largest element
                {
                        {10, 20, 30},
                        {35},
                        {-1} // No ceiling
                },
                // Case 5: Target between two values
                {
                        {1, 3, 6, 9, 12},
                        {4},
                        {2} // Ceiling is 6
                },
                // Case 6: Target is in array
                {
                        {2, 4, 6, 8, 10},
                        {6},
                        {2} // Exact match
                },
                // Case 7: Ceiling is the last element
                {
                        {3, 6, 9, 12, 15},
                        {14},
                        {4} // Ceiling is 15
                },
                // Case 8: All values smaller than target
                {
                        {1, 2, 3, 4, 5},
                        {10},
                        {-1}
                },
                // Case 9: Duplicates, target not in array
                {
                        {1, 2, 2, 2, 4, 5},
                        {3},
                        {4} // Ceiling is 4
                },
                // Case 10: Negative values, target not in array
                {
                        {-50, -40, -30, -20, -10},
                        {-25},
                        {3} // Ceiling is -20
                },
                // Case 11: Mixed negative and positive
                {
                        {-5, -3, -1, 0, 2, 4},
                        {1},
                        {4} // Ceiling is 2
                },
                // Case 12: Target equals first element
                {
                        {10, 20, 30, 40},
                        {10},
                        {0}
                },
                // Case 13: Target just before an element
                {
                        {5, 10, 15, 20},
                        {14},
                        {2} // Ceiling is 15
                },
                // Case 14: Empty array
                {
                        {},
                        {5},
                        {-1}
                },
                // Case 15: Single element, ceiling exists
                {
                        {7},
                        {6},
                        {0}
                },
                // Case 16: Single element, no ceiling
                {
                        {7},
                        {10},
                        {-1}
                },
                // Case 17: Ceiling is Integer.MAX_VALUE
                {
                        {Integer.MIN_VALUE, -1000, 0, 1000, Integer.MAX_VALUE},
                        {1050},
                        {4}
                },
                // Case 18: Target between duplicate ceilings
                {
                        {10, 20, 20, 20, 30},
                        {21},
                        {4} // Ceiling is 30
                }
        };



        runTests(bsCeilingSolution, inputs);

    }

    private static void runTests(BS_CeilingSolution bsCeilingSolution, int[][][] inputs) {

        boolean allTestsPassed = true;

        for (int i = 0; i < inputs.length; i++) {
            int[] arr = inputs[i][0];
            int target = inputs[i][1][0];
            int expectedOutput = inputs[i][2][0];

            long startTime = System.nanoTime();
            int result = bsCeilingSolution.search(arr, target);
            long endTime = System.nanoTime();

            if (result == expectedOutput) {
                System.out.println("Test " + (i + 1) + " passed ✅");
                System.out.println("Expected: " + expectedOutput + ", and got: " + result);
                System.out.println("Execution Time: " + (endTime - startTime) + " ns");
            } else {
                System.out.println("Test " + (i + 1) + " failed ❌");
                System.out.println("Expected: " + expectedOutput + ", but got: " + result);
                System.out.println("Execution Time: " + (endTime - startTime) + " ns");
                allTestsPassed = false;
            }
        }

        if (allTestsPassed) {
            System.out.println("\nAll tests passed! 🎉");
        } else {
            System.out.println("\nSome tests failed.");
        }
    }

    private static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i; // Array: [0, 1, 2, 3, ..., size-1]
        }
        return array;
    }

}
