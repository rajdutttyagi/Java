import java.util.Scanner;

public class Armstronfunc {


    public static int count(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int digits = count(num);
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + power(rem, digits);
            temp = temp / 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Armstrong or not: ");
        int num = sc.nextInt();
        sc.close();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
