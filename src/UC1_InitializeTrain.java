import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 *
 * Goal: Initialize the Train Consist Management App and display
 * the initial state of the train consist.
 *
 * Key Concepts:
 *  - Class & Main Method: Entry point of the Java application
 *  - Static Keyword: Allows JVM to call main() without creating an instance
 *  - ArrayList: Resizable dynamic collection from Java Collections Framework
 *  - List Interface: Abstraction over different list implementations
 *  - Console Output: System.out.println() to display messages
 *  - Dynamic Initialization: Empty collection populated later
 */
public class UC1_InitializeTrain {

    public static void main(String[] args) {

        // Display welcome message
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC1: Initialize Train and Display Consist Summary");
        System.out.println("--------------------------------------------");

        // Initialize an empty List using ArrayList
        // The train consist starts with no bogies attached
        List<String> trainConsist = new ArrayList<>();

        // Display the initial bogie count using size()
        System.out.println("Train initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());
        System.out.println("Status: Ready to accept bogies.");
        System.out.println("--------------------------------------------");
        System.out.println("Program continues...");
    }
}
