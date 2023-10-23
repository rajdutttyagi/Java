import java.util.*;

public class Calculatorfunc {

    public static add( x,  y) {
        return x + y;
    }
    public static  subtract( x,  y) {
        return x - y;
    }
    public static  multiply( x,  y) {
        return x * y;
    }
    public static  divide( x,  y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error: Division by zero");
            return Nan;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        while (true) {
            System.out.print("Enter choice (1/2/3/4 or 'q' to quit): ");
            String choice = scanner.nextLine();

            if (choice.equals("q")) {
                break;
            }

            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                scanner.nextLine(); 

                switch (choice) {
                    case "1":
                        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                        break;
                    case "2":
                        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                        break;
                    case "3":
                        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                        break;
                    case "4":
                        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                        break;
                }
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
