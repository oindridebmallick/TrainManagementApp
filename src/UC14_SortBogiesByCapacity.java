import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UC14_SortBogiesByCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC14: Sort Bogies by Capacity (Comparator)");
        System.out.println("------------------------------------------");

        List<Bogie> passengerBogies = new ArrayList<>();

        passengerBogies.add(new Bogie("BG201", "Sleeper", 72));
        passengerBogies.add(new Bogie("BG202", "AC Chair", 56));
        passengerBogies.add(new Bogie("BG203", "First Class", 18));
        passengerBogies.add(new Bogie("BG204", "Second Class", 90));
        passengerBogies.add(new Bogie("BG205", "AC 3-Tier", 64));

        System.out.println("\nOriginal Bogie List (unsorted):");
        displayBogies(passengerBogies);

        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        System.out.println("\nBogies Sorted by Capacity (Ascending):");
        displayBogies(passengerBogies);

        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
        System.out.println("\nBogies Sorted by Capacity (Descending - High to Low):");
        displayBogies(passengerBogies);

        System.out.println("\nCapacity Analysis:");
        System.out.println("  Highest Capacity Bogie: " + passengerBogies.get(0).getType()
                + " (" + passengerBogies.get(0).getCapacity() + " seats)");
        System.out.println("  Lowest Capacity Bogie : " + passengerBogies.get(passengerBogies.size() - 1).getType()
                + " (" + passengerBogies.get(passengerBogies.size() - 1).getCapacity() + " seats)");

        System.out.println("------------------------------------------");
        System.out.println("Program continues...");
    }

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