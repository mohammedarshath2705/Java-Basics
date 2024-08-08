/*Given n integer ranges, the task is to return the maximum occurring integer in the given ranges.
If more than one such integer exists, return the smallest one.
The ranges are in two arrays l[] and r[].  l[i] consists of the starting point of the range
 and r[i] consists of the corresponding endpoint of the range & a maxx which is the maximum value of r[].*/



public class Main {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        // Step 1: Create and initialize the frequency array
        int[] freq = new int[maxx + 2];

        // Step 2: Mark the ranges
        for (int i = 0; i < n; i++) {
            freq[l[i]] += 1;
            freq[r[i] + 1] -= 1;
        }

        // Step 3: Calculate the prefix sum and find the maximum frequency
        int maxFrequency = freq[0];
        int maxOccuredNum = 0;
        int currentFrequency = 0;

        for (int i = 0; i <= maxx; i++) {
            currentFrequency += freq[i];

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                maxOccuredNum = i;
            }
        }

        return maxOccuredNum;
    }
    public static void main(String[] args) {
        int l[] = {2, 1, 3};
        int r[] = {5, 3, 9};
        int maxx = 9;

        System.out.println(maxOccured(3, l, r, maxx));
    }
}
/*For example, consider the following ranges.
l[] = {2, 1, 3}, r[] = {5, 3, 9}
Ranges represented by the above arrays are.
[2, 5] = {2, 3, 4, 5}
[1, 3] = {1, 2, 3}
[3, 9] = {3, 4, 5, 6, 7, 8, 9}
The maximum occurred integer in these ranges is 3.*/