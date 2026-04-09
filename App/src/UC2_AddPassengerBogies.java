import java.util.ArrayList;

/**
 * UC2_AddPassengerBogies.java
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 *
 * Drawback of UC1: The train consist was initialized but had no bogies.
 * There was no way to add, remove, or inspect bogies dynamically.
 *
 * Goal: Allow dynamic insertion and removal of passenger bogies using ArrayList.
 *
 * Key Concepts:
 *  - ArrayList  : Resizable collection allowing runtime insertion and deletion
 *  - add()      : Inserts elements into the list
 *  - remove()   : Deletes elements from the list
 *  - contains() : Checks whether a given element exists in the list
 *  - Insertion Order Preservation: ArrayList maintains the order elements are added
 *  - CRUD Operations: Create, Read, Update, Delete on collections
 *
 * Flow:
 *  1. User runs program
 *  2. Passenger bogies are added
 *  3. Bogies are displayed
 *  4. A bogie is removed
 *  5. Existence is checked
 *  6. Program continues
 */
public class UC2_AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC2: Add Passenger Bogies to Train (ArrayList Operations)");
        System.out.println("----------------------------------------------------------");

        // Create an ArrayList<String> for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 1: Add bogies using add()
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 2: Print the list after insertion
        System.out.println("\nPassenger Bogies after insertion:");
        for (String bogie : passengerBogies) {
            System.out.println("  -> " + bogie);
        }
        System.out.println("Total bogies: " + passengerBogies.size());

        // Step 3: Remove a bogie using remove()
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println("  Bogies: " + passengerBogies);

        // Step 4: Use contains() to check if Sleeper exists
        boolean sleeperExists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes 'Sleeper' exist in the consist? " + sleeperExists);

        // Step 5: Print final list state
        System.out.println("\nFinal Passenger Bogie List:");
        for (String bogie : passengerBogies) {
            System.out.println("  -> " + bogie);
        }
        System.out.println("Final bogie count: " + passengerBogies.size());
        System.out.println("----------------------------------------------------------");
        System.out.println("Program continues...");
    }
}
