import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 *
 * Goal: Ensure no duplicate bogie IDs are added to the train.
 *
 * Drawback of UC2: A List allows duplicate values, which is dangerous
 * in a railway system. Two bogies could accidentally be registered with
 * the same ID (e.g., BG101, BG101), violating business rules.
 *
 * Key Concepts:
 *  - HashSet: Stores unique elements using hashing for fast access
 *  - Set Interface: Collection type that does NOT allow duplicate elements
 *  - add(): Inserts values into the set; duplicates are silently ignored
 *  - Automatic Deduplication: HashSet ensures uniqueness without manual checks
 *  - Unordered Storage: Elements are NOT stored by index positions
 *
 * Flow:
 *  - User adds bogie IDs
 *  - System inserts into HashSet
 *  - Duplicates are ignored automatically
 *  - Unique IDs are displayed
 */
public class UC3_TrackUniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC3: Track Unique Bogie IDs (Set – HashSet)");
        System.out.println("--------------------------------------------");

        // Create a HashSet<String> for bogie IDs
        Set<String> bogieIdSet = new HashSet<>();

        // Add bogie IDs — including intentional duplicates
        bogieIdSet.add("BG101");
        bogieIdSet.add("BG102");
        bogieIdSet.add("BG103");
        bogieIdSet.add("BG101"); // Duplicate — will be ignored automatically
        bogieIdSet.add("BG104");
        bogieIdSet.add("BG102"); // Duplicate — will be ignored automatically

        System.out.println("\nAttempted to add: BG101, BG102, BG103, BG101, BG104, BG102");
        System.out.println("(BG101 and BG102 were duplicate entries)");

        // Print the final set (duplicates will not appear)
        System.out.println("\nUnique Bogie IDs in Train Consist:");
        for (String id : bogieIdSet) {
            System.out.println("  -> " + id);
        }

        System.out.println("\nTotal unique bogies registered: " + bogieIdSet.size());
        System.out.println("Note: HashSet does NOT guarantee insertion order.");
        System.out.println("--------------------------------------------");
        System.out.println("Program continues...");
    }
}
