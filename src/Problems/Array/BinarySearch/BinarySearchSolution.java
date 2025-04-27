package Problems.Array.BinarySearch;

public class BinarySearchSolution {

    protected int search (int[] arr, int t) {
        return binarySearch (arr, t);
    }

    private int binarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = getMid(start, end);
            if (target == arr[mid]) { // found the target at mid
                if (mid == 0 || arr[mid - 1] != target) {
                    return mid;
                }
                end = mid - 1;
            } else if (target < arr[mid]) { // need to go left
                end = mid - 1;
            } else if (target > arr[mid]) { // need to go right
                start = mid + 1;
            }
        }

        return -1;
    }

    private int getMid (int start, int end) {
        return start + ((end - start) / 2);
    }

}
