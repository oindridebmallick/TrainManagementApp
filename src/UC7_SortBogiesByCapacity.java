import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * UC7: Sort Bogies by Capacity (Comparator)
 *
 * Goal: Sort passenger bogies based on their seating capacity using
 * a custom Comparator, enabling planning and analytics.
 *
 * Drawback of UC6: HashMap stores bogies with their capacity, but the data
 * is unordered from a planning perspective. In real railway operations,
 * administration needs to:
 *   - Identify high-capacity bogies first
 *   - Arrange bogies for optimal usage
 *   - Compare passenger capacity across classes
 *
 * Key Concepts:
 *  - Comparator Interface: Functional interface for custom comparison logic
 *  - Custom Objects: Bogies modeled as Java objects with name and capacity fields
 *  - List Collection: Stores multiple Bogie objects for sorting and iteration
 *  - sort() Method: Applies Comparator logic to rearrange elements in the list
 *  - Lambda Expressions: Concise way to express comparison logic inline
 *  - Separation of Data and Logic: Bogie data is independent of sorting behavior
 *
 * Flow:
 *  1. User creates passenger bogie objects
 *  2. Bogies are stored in a List
 *  3. System applies a Comparator to sort by capacity
 *  4. Sorted bogies are displayed in ascending and descending order
 *  5. Program continues
 */
public class UC7_SortBogiesByCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC7: Sort Bogies by Capacity (Comparator)");
        System.out.println("------------------------------------------");

        // Step 1: Create a List<Bogie> to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies with their seating capacities
        passengerBogies.add(new Bogie("BG201", "Sleeper", 72));
        passengerBogies.add(new Bogie("BG202", "AC Chair", 56));
        passengerBogies.add(new Bogie("BG203", "First Class", 18));
        passengerBogies.add(new Bogie("BG204", "Second Class", 90));
        passengerBogies.add(new Bogie("BG205", "AC 3-Tier", 64));

        // Step 3: Display original (unsorted) list
        System.out.println("\nOriginal Bogie List (unsorted):");
        displayBogies(passengerBogies);

        // Step 4: Sort in ASCENDING order of capacity using Comparator lambda
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        System.out.println("\nBogies Sorted by Capacity (Ascending):");
        displayBogies(passengerBogies);

        // Step 5: Sort in DESCENDING order of capacity using reversed Comparator
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
        System.out.println("\nBogies Sorted by Capacity (Descending - High to Low):");
        displayBogies(passengerBogies);

        // Step 6: Identify the highest and lowest capacity bogies
        System.out.println("\nCapacity Analysis:");
        System.out.println("  Highest Capacity Bogie: " + passengerBogies.get(0).getType()
                + " (" + passengerBogies.get(0).getCapacity() + " seats)");
        System.out.println("  Lowest Capacity Bogie : " + passengerBogies.get(passengerBogies.size() - 1).getType()
                + " (" + passengerBogies.get(passengerBogies.size() - 1).getCapacity() + " seats)");

        System.out.println("------------------------------------------");
        System.out.println("Program continues...");
    }

    /**
     * Helper method to display the list of bogies in a formatted table.
     */
    private static void displayBogies(List<Bogie> bogies) {
        System.out.println("  ID      | Type            | Capacity");
        System.out.println("  --------+-----------------+---------");
        for (Bogie bogie : bogies) {
            System.out.printf("  %-8s| %-17s| %d seats%n",
                    bogie.getBogieId(),
                    bogie.getType(),
                    bogie.getCapacity());
        }
    }
}
