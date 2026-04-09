import java.util.*;

/**
 * MainApp.java — Train Consist Management App
 *
 * Entry point that demonstrates all 7 Use Cases sequentially.
 * Each UC builds upon the previous to progressively introduce Java concepts.
 *
 * UC1 → Initialize train + ArrayList
 * UC2 → ArrayList CRUD operations (add/remove/contains)
 * UC3 → HashSet for uniqueness enforcement
 * UC4 → LinkedList for ordered consist with positional insertion/removal
 * UC5 → LinkedHashSet for uniqueness + insertion-order preservation
 * UC6 → HashMap for bogie-capacity key-value mapping
 * UC7 → Comparator for custom sorting of Bogie objects
 */
public class MainApp {

    public static void main(String[] args) {

        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║    Train Consist Management App — Demo     ║");
        System.out.println("║        All Use Cases UC1 through UC7       ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println();

        runUC1();
        runUC2();
        runUC3();
        runUC4();
        runUC5();
        runUC6();
        runUC7();

        System.out.println();
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║  All Use Cases Completed Successfully!     ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    // ─── UC1: Initialize Train ─────────────────────────────────────────────────
    private static void runUC1() {
        System.out.println("━━━ UC1: Initialize Train and Display Consist Summary ━━━");
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Welcome to Train Consist Management App!");
        System.out.println("Initial bogie count: " + trainConsist.size());
        System.out.println();
    }

    // ─── UC2: ArrayList Operations ────────────────────────────────────────────
    private static void runUC2() {
        System.out.println("━━━ UC2: Add Passenger Bogies (ArrayList Operations) ━━━");
        ArrayList<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("After adding: " + passengerBogies);
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);
        System.out.println("Contains Sleeper: " + passengerBogies.contains("Sleeper"));
        System.out.println();
    }

    // ─── UC3: HashSet for Uniqueness ──────────────────────────────────────────
    private static void runUC3() {
        System.out.println("━━━ UC3: Track Unique Bogie IDs (HashSet) ━━━");
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101"); bogieIds.add("BG102"); bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate — ignored
        bogieIds.add("BG104"); bogieIds.add("BG102"); // Duplicate — ignored
        System.out.println("Unique Bogie IDs: " + bogieIds);
        System.out.println("Total unique: " + bogieIds.size());
        System.out.println();
    }

    // ─── UC4: LinkedList for Ordered Consist ─────────────────────────────────
    private static void runUC4() {
        System.out.println("━━━ UC4: Maintain Ordered Bogie IDs (LinkedList) ━━━");
        LinkedList<String> consist = new LinkedList<>();
        consist.add("Engine"); consist.add("Sleeper");
        consist.add("AC Chair"); consist.add("Cargo"); consist.add("Guard");
        consist.add(2, "Pantry Car"); // Insert at position 2
        System.out.println("After insert: " + consist);
        consist.removeFirst(); consist.removeLast();
        System.out.println("After removing first & last: " + consist);
        System.out.println();
    }

    // ─── UC5: LinkedHashSet for Order + Uniqueness ────────────────────────────
    private static void runUC5() {
        System.out.println("━━━ UC5: Preserve Insertion Order (LinkedHashSet) ━━━");
        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine"); formation.add("Sleeper");
        formation.add("Cargo");  formation.add("Guard");
        formation.add("Sleeper"); // Duplicate — ignored, order preserved
        formation.add("Pantry Car");
        System.out.println("Train Formation (order preserved, no duplicates):");
        int pos = 1;
        for (String b : formation) System.out.println("  " + pos++ + ". " + b);
        System.out.println();
    }

    // ─── UC6: HashMap for Bogie-Capacity Mapping ─────────────────────────────
    private static void runUC6() {
        System.out.println("━━━ UC6: Map Bogie to Capacity (HashMap) ━━━");
        Map<String, Integer> capacityMap = new HashMap<>();
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 18);
        capacityMap.put("Second Class", 90);
        System.out.println("Bogie Capacities:");
        for (Map.Entry<String, Integer> e : capacityMap.entrySet())
            System.out.println("  " + e.getKey() + " → " + e.getValue() + " seats");
        System.out.println("Sleeper capacity (fast lookup): " + capacityMap.get("Sleeper"));
        System.out.println();
    }

    // ─── UC7: Comparator for Sorting Bogie Objects ───────────────────────────
    private static void runUC7() {
        System.out.println("━━━ UC7: Sort Bogies by Capacity (Comparator) ━━━");
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("BG201", "Sleeper", 72));
        bogies.add(new Bogie("BG202", "AC Chair", 56));
        bogies.add(new Bogie("BG203", "First Class", 18));
        bogies.add(new Bogie("BG204", "Second Class", 90));
        bogies.add(new Bogie("BG205", "AC 3-Tier", 64));

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        System.out.println("Sorted by Capacity (Ascending):");
        for (Bogie b : bogies)
            System.out.printf("  %-12s → %d seats%n", b.getType(), b.getCapacity());

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
        System.out.println("Sorted by Capacity (Descending):");
        for (Bogie b : bogies)
            System.out.printf("  %-12s → %d seats%n", b.getType(), b.getCapacity());
        System.out.println();
    }
}
