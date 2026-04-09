import java.util.LinkedHashSet;
import java.util.Set;

public class UC12_PreserveInsertionOrder {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC12: Preserve Insertion Order of Bogies (LinkedHashSet)");
        System.out.println("---------------------------------------------------------");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("\nInitial Train Formation (insertion order preserved):");
        for (String bogie : trainFormation) {
            System.out.println("  -> " + bogie);
        }

        boolean added = trainFormation.add("Sleeper");
        System.out.println("\nAttempted to add 'Sleeper' again...");
        System.out.println("Was 'Sleeper' added? " + added + " (duplicate rejected automatically)");

        trainFormation.add("Pantry Car");
        System.out.println("\nAdded 'Pantry Car' to the formation.");

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