import java.util.Scanner;
public class Greatestofthree {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt(),b=sc.nextInt();
       System.out.println("enter c");
       int c=sc.nextInt();
       int d=a>b? (a>c?a:c):(b>c?b:c);
       System.out.println("greatest among three is"+d);
    
}
}
