// A class to represent simple interest
class SimpleInterest {
  // Instance variables
  private double principal;
  private double rate; 
  private double time; 

 
  public SimpleInterest(double principal, double rate, double time) {
    this.principal = principal;
    this.rate = rate;
    this.time = time;
  }

  
  public double calculate() {
    
    return (principal * rate * time) / 100;
  }
}


public class Main {
  public static void main(String[] args) {
    // Example values
    double p = 10000; // principal amount
    double r = 5; // interest rate
    double t = 2; 

    // Create an object of SimpleInterest class
    SimpleInterest si = new SimpleInterest(p, r, t);

    // Call the calculate method and print the result
    System.out.println("The simple interest is: " + si.calculate());
  }
}


