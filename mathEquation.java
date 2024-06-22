//Kenneth Smith 
//5.2
//6-22-2-2024

//This program is intended to display the math operations both in the smaller to larger order 
//and then the larger to smaller order with the denominator being 3 through 99. 

public class mathEquation {
    public static void main(String[] args) {
        // Initialize the denominators
        int start = 3;
        int end = 99;

        // Display the equation in ascending order
        System.out.println("Series in ascending order:");
        int denominator = start;
        double sumAscending = 0.0;
        while (denominator <= end) {
            double term = 1.0 / denominator;
            System.out.printf("1/%d.0 = %.6f\n", denominator, term);
            sumAscending += term;
            denominator += 2; // Move to the next odd number
        }
        System.out.printf("Sum in ascending order: %.6f\n", sumAscending);

        // Display the equation in descending order
        System.out.println("\nSeries in descending order:");
        denominator = end;
        double sumDescending = 0.0;
        while (denominator >= start) {
            double term = 1.0 / denominator;
            System.out.printf("1/%d.0 = %.6f\n", denominator, term);
            sumDescending += term;
            denominator -= 2; // Move to the previous odd number
        }
        System.out.printf("Sum in descending order: %.6f\n", sumDescending);
    }
}
