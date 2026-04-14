import java.util.Arrays;

/**
 * UC17: Sort Bogie Names Using Arrays.sort()
 * 
 * Demonstrates the use of built-in optimized sorting utilities in Java.
 */
public class UC17_ArraysSortBogies {

    public static void main(String[] args) {
        System.out.println("━━━ UC17: Sort Bogie Names Using Arrays.sort() ━━━");

        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
        System.out.println("Initial Bogie Names: " + Arrays.toString(bogieTypes));

        // Use built-in Dual-Pivot Quicksort / TimSort
        Arrays.sort(bogieTypes);

        System.out.println("Sorted Bogie Names (Alphabetical): " + Arrays.toString(bogieTypes));

        // Test with Unsorted Input
        String[] unsortedInput = {"Luxury", "General", "Sleeper", "AC Chair"};
        System.out.println("\nInitial (random order): " + Arrays.toString(unsortedInput));
        Arrays.sort(unsortedInput);
        System.out.println("Sorted (alphabetical): " + Arrays.toString(unsortedInput));
    }
}
