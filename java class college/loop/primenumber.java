import java.util.Scanner;

public class primenumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("The number is not prime.");
        } else {
            System.out.println("The number is prime.");
            

            for (int i = 0; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println("The number is prime.");
                    
                    break;
                }
            }

            
        }
    }
}

