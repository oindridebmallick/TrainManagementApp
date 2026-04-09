import java.util.LinkedList;

/**
 * UC4: Maintain Ordered Bogie IDs (LinkedList)
 *
 * Goal: Maintain the physical order and sequence of bogies in the train consist.
 *
 * Drawback of UC3: HashSet does not preserve order. A train consist must follow
 * a physical sequence: Locomotive → Passenger → Cargo → Guard Coach.
 * With HashSet, the arrangement becomes unpredictable.
 *
 * Solution: LinkedList maintains insertion order, supports fast insertions
 * and deletions at both ends and at arbitrary positions.
 *
 * Key Concepts:
 *  - LinkedList: A doubly linked list where elements are connected via node references
 *  - Node Structure: Each element has data + links to previous and next nodes
 *  - addFirst() / addLast(): Attach bogies at the beginning or end of the consist
 *  - add(index, element): Inserts a bogie in the middle of the consist
 *  - removeFirst() / removeLast(): Detaches bogies from the head or tail
 *  - Order Preservation: Maintains the physical sequence of train bogies
 *
 * Flow:
 *  1. User adds bogie IDs
 *  2. System inserts into LinkedList in order
 *  3. A Pantry Car is inserted at position 2
 *  4. First and last bogies are removed
 *  5. Final ordered consist is displayed
 */
public class UC4_MaintainOrderedBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC4: Maintain Ordered Bogie IDs (LinkedList)");
        System.out.println("---------------------------------------------");

        // Create a LinkedList<String> for the train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 1: Add bogies in physical train order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist (in order):");
        printConsist(trainConsist);

        // Step 2: Insert a Pantry Car at position 2 (between Sleeper and AC Chair)
        trainConsist.add(2, "Pantry Car");
        System.out.println("\nAfter inserting 'Pantry Car' at position 2:");
        printConsist(trainConsist);

        // Step 3: Remove the first bogie (Engine detached from front)
        String removedFirst = trainConsist.removeFirst();
        System.out.println("\nRemoved first bogie: " + removedFirst);

        // Step 4: Remove the last bogie (Guard coach detached from rear)
        String removedLast = trainConsist.removeLast();
        System.out.println("Removed last bogie: " + removedLast);

        // Step 5: Display the final ordered train consist
        System.out.println("\nFinal Ordered Train Consist:");
        printConsist(trainConsist);

        System.out.println("Total bogies in consist: " + trainConsist.size());
        System.out.println("---------------------------------------------");
        System.out.println("Program continues...");
    }

    /**
     * Helper method to print the train consist with indices.
     */
    private static void printConsist(LinkedList<String> consist) {
        for (int i = 0; i < consist.size(); i++) {
            System.out.println("  [" + i + "] " + consist.get(i));
        }
    }
}
