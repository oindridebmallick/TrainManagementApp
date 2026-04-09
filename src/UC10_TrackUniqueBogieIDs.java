import java.util.HashSet;
import java.util.Set;

public class UC10_TrackUniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC10: Track Unique Bogie IDs (Set – HashSet)");
        System.out.println("--------------------------------------------");

        Set<String> bogieIdSet = new HashSet<>();

        bogieIdSet.add("BG101");
        bogieIdSet.add("BG102");
        bogieIdSet.add("BG103");
        bogieIdSet.add("BG101");
        bogieIdSet.add("BG104");
        bogieIdSet.add("BG102");

        System.out.println("\nAttempted to add: BG101, BG102, BG103, BG101, BG104, BG102");
        System.out.println("(BG101 and BG102 were duplicate entries)");

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