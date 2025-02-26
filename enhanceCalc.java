import java.util.Scanner;

public class enhanceCalc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nEnhanced Console-Based Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Temperature Conversion");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addition(sc);
                case 2 -> subtraction(sc);
                case 3 -> multiplication(sc);
                case 4 -> division(sc);
                case 5 -> squareRoot(sc);
                case 6 -> exponentiation(sc);
                case 7 -> temperatureConversion(sc);
                case 8 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 9);

        sc.close();
    }

    public static void addition(Scanner scanner) {
        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Result: " + (a + b));
    }  

    public static void subtraction(Scanner scanner) {
        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Result: " + (a - b));
    }

    public static void multiplication(Scanner scanner) {
        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Result: " + (a * b));
    }

    public static void division(Scanner scanner) {
        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }
    public static void squareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Error! Cannot calculate square root of a negative number.");
        } else {
            System.out.println("Square Root: " + Math.sqrt(num));
        }
    }
    public static void exponentiation(Scanner scanner) {
        System.out.print("Enter base and exponent: ");
        double base = scanner.nextDouble();
        double exponent = scanner.nextDouble();
        System.out.println("Result: " + Math.pow(base, exponent));
    }
    public static void temperatureConversion(Scanner scanner) {
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion: ");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        double convertedTemp;

        if (choice == 1) {
            convertedTemp = (temp * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + convertedTemp);
        } else if (choice == 2) {
            convertedTemp = (temp - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + convertedTemp);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}

