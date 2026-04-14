/**
 * UC15: Safe Cargo Assignment Using try-catch-finally
 * 
 * Demonstrates runtime exception handling in a railway system context.
 */
public class UC15_SafeCargoAssignment {

    public static void main(String[] args) {
        System.out.println("━━━ UC15: Safe Cargo Assignment Using try-catch-finally ━━━");

        // Test Case 1: Safe Assignment
        System.out.println("\nTesting Safe Assignment:");
        assignCargo("Cylindrical", "Petroleum");

        // Test Case 2: Unsafe Assignment
        System.out.println("\nTesting Unsafe Assignment:");
        assignCargo("Rectangular", "Petroleum");

        System.out.println("\nProgram Execution Completed Successfully.");
    }

    /**
     * Attempts to assign cargo to a bogie based on its shape.
     * Throws CargoSafetyException for unsafe combinations.
     */
    public static void assignCargo(String shape, String cargo) {
        try {
            System.out.println("[Process] Attempting to assign " + cargo + " to " + shape + " bogie.");
            
            // Validation Logic
            if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("SAFETY ALERT: Cannot assign Petroleum to a Rectangular bogie!");
            }

            System.out.println("[Success] " + cargo + " assigned successfully to " + shape + " bogie.");

        } catch (CargoSafetyException e) {
            System.err.println("[Exception Caught] " + e.getMessage());
        } finally {
            System.out.println("[Finally] Safety validation check completed.");
        }
    }
}
