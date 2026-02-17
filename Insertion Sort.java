import java.util.Arrays;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = {50, 80, 30, 60, 10, 40, 20, 70};
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    /**
     * Sorts an array of integers using the Insertion Sort algorithm.
     * 
     * @param arr The array to be sorted.
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be inserted
            int j = i - 1; // Index of the last element in the sorted part

            // Move elements of arr[0..i-1] that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert the key in its correct position
        }
    }
}
