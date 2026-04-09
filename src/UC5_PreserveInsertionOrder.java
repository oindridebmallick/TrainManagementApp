import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * Goal: Maintain insertion order while enforcing uniqueness of bogie IDs.
 *
 * Drawback of UC4 (LinkedList): Train yards perform last-minute attachments and
 * emergency removals. Plain list logic has no enforced removal discipline and
 * doesn't model LIFO behavior. More importantly, duplicates can slip through.
 *
 * Solution: LinkedHashSet combines:
 *  - Uniqueness (like HashSet) → prevents duplicate bogies
 *  - Insertion Order Preservation (like LinkedList) → keeps physical attachment order
 *
 * Key Concepts:
 *  - LinkedHashSet: A hash table + linked list implementation of Set interface
 *  - Set Interface: Does NOT allow duplicate elements
 *  - add(): Inserts a bogie; if already exists, insertion is silently ignored
 *  - Automatic Deduplication: No manual validation needed
 *  - Insertion Order Preservation: Unlike HashSet, LinkedHashSet maintains sequence
 *  - Ordered Iteration: Bogies are returned in the exact order they were attached
 *
 * Flow:
 *  1. User adds bogies
 *  2. LinkedHashSet stores them preserving order
 *  3. Duplicate insertion is attempted (silently rejected)
 *  4. Formation is printed in original attachment order
 */
public class UC5_PreserveInsertionOrder {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC5: Preserve Insertion Order of Bogies (LinkedHashSet)");
        System.out.println("---------------------------------------------------------");

        // Create a LinkedHashSet<String> to represent the train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 1: Attach bogies in physical order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("\nInitial Train Formation (insertion order preserved):");
        for (String bogie : trainFormation) {
            System.out.println("  -> " + bogie);
        }

        // Step 2: Attempt to attach a duplicate bogie (Sleeper again)
        boolean added = trainFormation.add("Sleeper"); // Should return false
        System.out.println("\nAttempted to add 'Sleeper' again...");
        System.out.println("Was 'Sleeper' added? " + added + " (duplicate rejected automatically)");

        // Step 3: Add one more new bogie
        trainFormation.add("Pantry Car");
        System.out.println("\nAdded 'Pantry Car' to the formation.");

        // Step 4: Display the final formation order
        System.out.println("\nFinal Train Formation (order preserved, no duplicates):");
        int position = 1;
        for (String bogie : trainFormation) {
            System.out.println("  Position " + position + ": " + bogie);
            position++;
        }

        System.out.println("\nTotal bogies in formation: " + trainFormation.size());
        System.out.println("---------------------------------------------------------");
        System.out.println("Program continues...");
    }
}
