/*Given an array arr of positive integers.
The task is to return the maximum of j - i subjected to the constraint of arr[i] < arr[j] and i < j.*/
 


public class Main {
    int maxIndexDiff(int[] arr) {
        int n = arr.length;

        // Step 1: Create and fill the Left Min Array
        int[] leftMin = new int[n];
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        }

        // Step 2: Create and fill the Right Max Array
        int[] rightMax = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(arr[j], rightMax[j + 1]);
        }

        // Step 3: Traverse both arrays to find the maximum difference
        int i = 0, j = 0;
        int maxDiff = 0; // Initialize to 0 to handle cases where no valid pair is found
        while (j < n && i < n) {
            if (leftMin[i] < rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
       Main main = new Main();
        int[] arr = {15,10,4,34,6565,89,6655,7,90}; // Single element case
        int result = main.maxIndexDiff(arr);
        System.out.println("Maximum difference of j - i is: " + result);
    }
}