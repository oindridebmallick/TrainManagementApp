import java.util.Arrays;

/**
 * UC18: Linear Search for Bogie ID (Array-Based Searching)
 * 
 * Demonstrates basic sequential searching in an unsorted array.
 */
public class UC18_LinearSearchBogie {

    public static void main(String[] args) {
        System.out.println("━━━ UC18: Linear Search for Bogie ID ━━━");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        System.out.println("Bogie IDs: " + Arrays.toString(bogieIds));
        System.out.println("Searching for: " + searchKey);

        boolean found = linearSearch(bogieIds, searchKey);
        System.out.println("Result: " + (found ? "Bogie Found!" : "Bogie Not Found."));

        // Case when not found
        System.out.println("\nSearching for: BG999");
        found = linearSearch(bogieIds, "BG999");
        System.out.println("Result: " + (found ? "Bogie Found!" : "Bogie Not Found."));
    }

    /**
     * Performs a sequential search for the target string in the array.
     * Time Complexity: O(n)
     */
    public static boolean linearSearch(String[] arr, String target) {
        for (String id : arr) {
            if (id.equals(target)) {
                return true; // Match found, terminate early
            }
        }
        return false; // Exhausted array, no match
    }
}
