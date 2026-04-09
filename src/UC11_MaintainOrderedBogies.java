import java.util.TreeSet;

public class UC11_MaintainOrderedBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC11: Maintain Ordered Bogie IDs (TreeSet & SortedSet)");
        System.out.println("---------------------------------------------");

        TreeSet<String> trainConsist = new TreeSet<>();

        trainConsist.add("BG104");
        trainConsist.add("BG102");
        trainConsist.add("BG101");
        trainConsist.add("BG103");
        trainConsist.add("BG105");

        System.out.println("\nBogie IDs added: BG104, BG102, BG101, BG103, BG105");
        System.out.println("\nBogie IDs in sorted order (TreeSet):");
        for (String id : trainConsist) {
            System.out.println("  -> " + id);
        }

        System.out.println("\nFirst (lowest): " + trainConsist.first());
        System.out.println("Last (highest): " + trainConsist.last());

        System.out.println("\nTotal bogies in consist: " + trainConsist.size());
        System.out.println("---------------------------------------------");
        System.out.println("Program continues...");
    }
}