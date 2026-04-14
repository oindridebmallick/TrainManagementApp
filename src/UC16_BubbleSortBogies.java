import java.util.Arrays;

/**
 * UC16: Sort Passenger Bogies by Capacity (Bubble Sort)
 * 
 * Demonstrates manual implementation of a comparison-based sorting algorithm.
 */
public class UC16_BubbleSortBogies {

    public static void main(String[] args) {
        System.out.println("━━━ UC16: Sort Passenger Bogies by Capacity (Bubble Sort) ━━━");

        int[] capacities = {72, 56, 24, 70, 60};
        System.out.println("Initial Capacities: " + Arrays.toString(capacities));

        bubbleSort(capacities);

        System.out.println("Sorted Capacities (Ascending): " + Arrays.toString(capacities));

        // Test with Duplicates
        int[] duplicates = {72, 56, 56, 24};
        System.out.println("\nInitial (with duplicates): " + Arrays.toString(duplicates));
        bubbleSort(duplicates);
        System.out.println("Sorted (with duplicates): " + Arrays.toString(duplicates));
    }

    /**
     * Sorts an array using the Bubble Sort algorithm.
     * Time Complexity: O(n^2)
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
