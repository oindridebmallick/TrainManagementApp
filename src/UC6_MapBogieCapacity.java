import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Map Bogie to Capacity (HashMap)
 *
 * Goal: Associate each bogie with its seating or load capacity using
 * a key–value mapping structure.
 *
 * Drawback of UC5: The train formation stored only bogie names (strings)
 * to maintain order and uniqueness. However, a real railway system needs
 * to store operational attributes per bogie such as:
 *   - Seating capacity for passenger bogies
 *   - Load capacity for goods bogies
 *   - Safety limits and constraints
 * With only a Set of strings, there is no way to associate data with a bogie.
 *
 * Key Concepts:
 *  - HashMap: Hash table implementation of Map; stores data as key–value pairs
 *  - Map Interface: Represents a mapping between unique keys and their values
 *  - put(): Inserts a key–value pair (bogie name → capacity)
 *  - Key–Value Association: Binds a bogie to its operational attribute
 *  - entrySet() Iteration: Provides a view of the map for iterating key-value pairs
 *  - Fast Lookup Using Keys: Constant-time retrieval using bogie name as key
 *
 * Flow:
 *  1. User creates a bogie-capacity mapping
 *  2. System stores bogie names as keys and capacities as values
 *  3. Entries are inserted into a HashMap
 *  4. System iterates through the map using entrySet()
 *  5. Capacity details are displayed for each bogie
 *  6. Program continues
 */
public class UC6_MapBogieCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC6: Map Bogie to Capacity (HashMap)");
        System.out.println("-------------------------------------");

        // Create a HashMap<String, Integer> to store bogie-capacity information
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 1: Use put() to map each bogie to its seating capacity
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 18);
        bogieCapacityMap.put("Second Class", 90);
        bogieCapacityMap.put("Pantry Car", 0); // Pantry car has no passenger seats

        System.out.println("\nBogie-Capacity Mapping:");
        System.out.println("  (Note: HashMap does not guarantee insertion order)");

        // Step 2: Iterate over the map using entrySet()
        System.out.println("\n  Bogie Name       | Capacity");
        System.out.println("  -----------------+---------");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.printf("  %-17s| %d seats%n", entry.getKey(), entry.getValue());
        }

        // Step 3: Fast lookup — retrieve capacity of a specific bogie using key
        String queryBogie = "Sleeper";
        int sleeperCapacity = bogieCapacityMap.get(queryBogie);
        System.out.println("\nFast Lookup:");
        System.out.println("  Capacity of '" + queryBogie + "': " + sleeperCapacity + " seats");

        // Step 4: Check if a bogie key exists before querying
        String checkBogie = "Goods Wagon";
        System.out.println("\nDoes '" + checkBogie + "' exist in map? " + bogieCapacityMap.containsKey(checkBogie));

        // Step 5: Display total number of mapped bogies
        System.out.println("\nTotal bogies mapped: " + bogieCapacityMap.size());
        System.out.println("-------------------------------------");
        System.out.println("Program continues...");
    }
}
