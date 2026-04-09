import java.util.ArrayList;
import java.util.List;

public class UC8_InitializeTrain {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC8: Initialize Train and Display Consist Summary");
        System.out.println("--------------------------------------------");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());
        System.out.println("Status: Ready to accept bogies.");
        System.out.println("--------------------------------------------");
        System.out.println("Program continues...");
    }
}