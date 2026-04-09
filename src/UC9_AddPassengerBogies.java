import java.util.ArrayList;

public class UC9_AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC9: Add Passenger Bogies to Train (ArrayList Operations)");
        System.out.println("----------------------------------------------------------");

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies after insertion:");
        for (String bogie : passengerBogies) {
            System.out.println("  -> " + bogie);
        }
        System.out.println("Total bogies: " + passengerBogies.size());

        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println("  Bogies: " + passengerBogies);

        boolean sleeperExists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes 'Sleeper' exist in the consist? " + sleeperExists);

        System.out.println("\nFinal Passenger Bogie List:");
        for (String bogie : passengerBogies) {
            System.out.println("  -> " + bogie);
        }
        System.out.println("Final bogie count: " + passengerBogies.size());
        System.out.println("----------------------------------------------------------");
        System.out.println("Program continues...");
    }
}