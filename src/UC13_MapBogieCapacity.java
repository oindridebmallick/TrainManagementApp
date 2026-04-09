import java.util.HashMap;
import java.util.Map;

public class UC13_MapBogieCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC13: Map Bogie to Capacity (HashMap)");
        System.out.println("-------------------------------------");

        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 18);
        bogieCapacityMap.put("Second Class", 90);
        bogieCapacityMap.put("Pantry Car", 0);

        System.out.println("\nBogie-Capacity Mapping:");
        System.out.println("  (Note: HashMap does not guarantee insertion order)");

        System.out.println("\n  Bogie Name       | Capacity");
        System.out.println("  -----------------+---------");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.printf("  %-17s| %d seats%n", entry.getKey(), entry.getValue());
        }

        String queryBogie = "Sleeper";
        int sleeperCapacity = bogieCapacityMap.get(queryBogie);
        System.out.println("\nFast Lookup:");
        System.out.println("  Capacity of '" + queryBogie + "': " + sleeperCapacity + " seats");

        String checkBogie = "Goods Wagon";
        System.out.println("\nDoes '" + checkBogie + "' exist in map? " + bogieCapacityMap.containsKey(checkBogie));

        System.out.println("\nTotal bogies mapped: " + bogieCapacityMap.size());
        System.out.println("-------------------------------------");
        System.out.println("Program continues...");
    }
}