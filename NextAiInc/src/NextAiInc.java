import java.util.Scanner;

public class NextAiInc {

    // Method to calculate and display weekly pay
    public void calculatePay(String employeeName, double basePay, int hoursWorked) {
        // Check for invalid base pay
        if (basePay < 30000.00) {
            System.out.println("Error: Base pay cannot be below UGX 30,000/hour. ");
            return;
        }

        // Check for excessive hours worked
        if (hoursWorked > 72) {
            System.out.println("Error: Hours worked cannot exceed 72 hours per week.");
            return;
        }

        // Calculate total pay
        double totalPay;
        if (hoursWorked <= 48) {
            totalPay = basePay * hoursWorked; // No overtime
        } else {
            int overtimeHours = hoursWorked - 48;
            totalPay = (basePay * 48) + (overtimeHours * basePay * 2); // Overtime pay
        }

        // Print out the total pay
        System.out.println(employeeName + " Total weekly pay: UGX " + totalPay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NextAiInc totalWeekly = new NextAiInc();

        // Define contractor names
        String[] contractors = {"Contractor A", "Contractor B", "Contractor C"};

        // Loop over each contractor
        for (String contractor : contractors) {
            // Prompt for base pay and hours worked
            System.out.print("\nEnter Base Pay per Hour (UGX) for " + contractor + ": ");
            double basePay = scanner.nextDouble();
            
            System.out.print("Enter Total Hours Worked for " + contractor + ": ");
            int hoursWorked = scanner.nextInt();

            // Calculate and display total pay
            totalWeekly.calculatePay(contractor, basePay, hoursWorked);
        }

        scanner.close();
    }
}
