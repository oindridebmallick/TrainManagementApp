import java.util.Arrays;

/**
 * UC19: Binary Search for Bogie ID (Optimized Searching)
 * 
 * Demonstrates a divide-and-conquer search approach on sorted data.
 */
public class UC19_BinarySearchBogie {

    public static void main(String[] args) {
        System.out.println("━━━ UC19: Binary Search for Bogie ID (Optimized) ━━━");

        // Input: Unsorted IDs
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String searchKey = "BG309";

        System.out.println("Original (Unsorted): " + Arrays.toString(bogieIds));

        // Precondition: Data must be sorted for Binary Search
        Arrays.sort(bogieIds);
        System.out.println("Sorted IDs: " + Arrays.toString(bogieIds));

        System.out.println("Searching for: " + searchKey);
        boolean found = binarySearch(bogieIds, searchKey);
        System.out.println("Result: " + (found ? "Bogie Found!" : "Bogie Not Found."));

        // Case when not found
        System.out.println("\nSearching for: BG999");
        found = binarySearch(bogieIds, "BG999");
        System.out.println("Result: " + (found ? "Bogie Found!" : "Bogie Not Found."));
    }

    /**
     * Performs a binary search for the target string in a sorted array.
     * Time Complexity: O(log n)
     */
    public static boolean binarySearch(String[] arr, String target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = target.compareTo(arr[mid]);

            if (comparison == 0) {
                return true; // Match found
            } else if (comparison < 0) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }
        return false; // Not found
    }
}
