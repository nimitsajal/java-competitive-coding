package Problems.Array.BinarySearch;

public class BinarySearchTest {

    public static void main(String[] args) {

        BinarySearchSolution binarySearchSolution = new BinarySearchSolution();

        int[][][] inputs = {
                // Test Case 1
                {
                        {11, 22, 33, 44, 55, 66, 77, 88},  // Input array
                        {77},  // Target
                        {6}    // Expected output
                },
                // Test Case 2
                {
                        {-4, -2, 0, 2, 44, 67},
                        {-2},
                        {1}
                },
                // Test Case 3
                {
                        {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {45},
                        {-1}
                },
                // Test Case 4: Empty Array
                {
                        {},
                        {5},
                        {-1}
                },
                // Test Case 5: Array of Size 1, Target found
                {
                        {1},
                        {1},
                        {0}
                },
                // Test Case 6: Array of Size 1, Target not found
                {
                        {1},
                        {5},
                        {-1}
                },
                // Test Case 7: Array with Duplicates, Target found
                {
                        {1, 2, 2, 2, 3},
                        {2},
                        {1} // Any index of 2
                },
                // Test Case 8: Large Array, Target in the middle
                {
                        generateArray(1_000_000),
                        {500_000},
                        {500_000}
                },
                // Test Case 9: Large Array, Target at the end
                {
                        generateArray(1_000_000),
                        {999_999},
                        {999_999}
                },
                // Test Case 10: Negative and Positive Values, Target found (Negative number)
                {
                        {-50, -20, -10, 0, 10, 20, 50},
                        {-10},
                        {2}
                },
                // Test Case 11: Negative and Positive Values, Target found (Positive number)
                {
                        {-50, -20, -10, 0, 10, 20, 50},
                        {20},
                        {5}
                },
                // Test Case 12: Integer Boundary Values, Target is Integer.MAX_VALUE
                {
                        {Integer.MIN_VALUE, -1000, 0, 1000, Integer.MAX_VALUE},
                        {Integer.MAX_VALUE},
                        {4}
                },
                // Test Case 13: Integer Boundary Values, Target is Integer.MIN_VALUE
                {
                        {Integer.MIN_VALUE, -1000, 0, 1000, Integer.MAX_VALUE},
                        {Integer.MIN_VALUE},
                        {0}
                },
                // Test Case 14: Target Not in Array
                {
                        {1, 3, 5, 7, 9},
                        {8},
                        {-1}
                },
                // Test Case 15: Target Not in Array
                {
                        {0, 2, 4, 6, 8},
                        {10},
                        {-1}
                },
                // Test Case 16: Target at Start of Array
                {
                        {10, 20, 30, 40, 50},
                        {10},
                        {0}
                },
                // Test Case 17: Target at End of Array
                {
                        {10, 20, 30, 40, 50},
                        {50},
                        {4}
                }
        };

        runTests(binarySearchSolution, inputs);

    }

    private static void runTests(BinarySearchSolution binarySearchSolution, int[][][] inputs) {

        boolean allTestsPassed = true;

        for (int i = 0; i < inputs.length; i++) {
            int[] arr = inputs[i][0];
            int target = inputs[i][1][0];
            int expectedOutput = inputs[i][2][0];

            long startTime = System.nanoTime();
            int result = binarySearchSolution.search(arr, target);
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
