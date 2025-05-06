package Problems.Array.BinarySearch;

public class BinarySearchSolution {

    protected int search(int[] arr, int target) {
        return binarySearch(arr, target);
    }

    private int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid;
        int result = -1;

        while(start <= end) {
            mid = getMid(start, end);
            if (target == arr[mid]) {
                // to handle duplicates
                // must return position of 1st duplicate number
                if (mid == 0 || arr[mid - 1] != target) {
                    return mid;
                }
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }

        return result;

    }

    private int getMid(int start, int end) {
        return start + ((end - start) / 2);
    }

}
