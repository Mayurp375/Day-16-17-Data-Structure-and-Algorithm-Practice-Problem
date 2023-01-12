package classProblemByAmolMateSir.Day16And17DataStructureAndAlgorithmPracticeProble;

public class Que2BinarySearch {

    // Returns index of x if it is present in arr[],
    // else return -1
    static int binarySearch(String[] arr, String x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);
            if (res == 0) {// Check if x is present at mid
                return m;
            }
            if (res > 0) { // If x greater, ignore left half
                l = m + 1;
            } else {  // If x is smaller, ignore right half
                r = m - 1;
            }
        }
        return -1;
    }

    // Driver method to test above
    public static void main(String[] args) {
        String[] arr = {"stand", "up", "and", "practice"};
        String x = "stand";
        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at " + "index " + result);
        }
    }
}