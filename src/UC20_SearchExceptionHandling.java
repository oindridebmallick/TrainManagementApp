import java.util.Arrays;

/**
 * UC20: Exception Handling During Search Operations
 * 
 * Demonstrates defensive programming (fail-fast) using IllegalStateException.
 */
public class UC20_SearchExceptionHandling {

    public static void main(String[] args) {
        System.out.println("━━━ UC20: Exception Handling During Search Operations ━━━");

        // Case 1: Search allowed (data exists)
        System.out.println("\nCase 1: Valid Search (Data exists)");
        String[] data = {"BG101", "BG205"};
        trySearch(data, "BG101");

        // Case 2: Exception expected (empty data)
        System.out.println("\nCase 2: Invalid Search (Empty data)");
        String[] emptyData = {};
        trySearch(emptyData, "BG101");
    }

    /**
     * Attempts to search for a bogie ID, but validates the state first.
     */
    public static void trySearch(String[] arr, String target) {
        try {
            validateState(arr);
            System.out.println("[Process] State valid. Proceeding with search...");
            
            boolean found = false;
            for (String s : arr) {
                if (s.equals(target)) {
                    found = true;
                    break;
                }
            }
            System.out.println("Result: " + (found ? "Bogie Found!" : "Bogie Not Found."));

        } catch (IllegalStateException e) {
            System.err.println("[Fail-Fast Exception] " + e.getMessage());
        }
    }

    /**
     * Ensures the bogie collection is not empty.
     * Throws IllegalStateException if no bogies are available.
     */
    private static void validateState(String[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("ERROR: Operation failed. No bogies exist in the train formation.");
        }
    }
}
