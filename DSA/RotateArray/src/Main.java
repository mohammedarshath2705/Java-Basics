public class Main {

    static void rotateArr(int[] arr, int d, int n) {
        // Handle cases where d > n
        d = d % n;

        // Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining elements
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Utility function to reverse a subarray
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
       // Main main = new Main();
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        int n = arr.length;
        rotateArr(arr, d, n);
        for (int i : arr) {
            System.out.print(i + " ");  // Output: 3 4 5 1 2
        }
    }
}