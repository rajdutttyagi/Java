import java .util.*;
public class Pattern7reverserhombus {
    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = n-1; k>=i; k--) {
                System.out.print(" ");
            }
             for (int j = 0; j < n; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}