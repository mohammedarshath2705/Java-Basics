

/*Given an array A of N elements.
Find the majority element in the array.
A majority element in an array A of size N is an element that appears strictly more than N/2 times in the array.*/


public class Main {
    static int majorityElement(int[] a, int size) {

        int candidate = findCandidate(a, size);


        if (isMajority(a, size, candidate)) {
            return candidate;
        } else {
            return -1;
        }
    }

    private static int findCandidate(int[] a, int size) {
        int candidate = -1;
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (count == 0) {
                candidate = a[i];
                count = 1;
            } else if (a[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    private static boolean isMajority(int[] a, int size, int candidate) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (a[i] == candidate) {
                count++;
            }
        }

        return count > size / 2;
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 1, 1, 1, 2, 2};
        int size = array.length;
        int majority = Main.majorityElement(array, size);
        System.out.println("Majority element is: " + majority);
    }
}