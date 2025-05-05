package Problems.Array.BS_Ceiling;

public class BS_CeilingSolution {

    protected int search(int[] arr, int target) {
        return ceilSearch(arr, target);
    }

    private int ceilSearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int result = -1;

        if (arr.length == 0 || target > arr[end] || target < arr[start]) {
            return result;
        }

        while(start <= end) {
            mid = getMid(start, end);
            if (target == arr[mid]) {
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
        if (mid >= arr.length - 1) {
            mid --;
        }
        if (target > arr[mid]) {
            result = mid;
        } else {
            result = mid + 1;
        }
        System.out.println("mid = " + mid);
        return result;

    }

    private int getMid(int start, int end) {
        return start + ((end - start) / 2);
    }

}
