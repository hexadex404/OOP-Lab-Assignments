import java.util.Scanner;

public class CalcTwoNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double x1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double x2 = input.nextDouble();
        
        double s = x1 + x2;
        double d = x1 - x2;
        double p = x1 * x2;
        double q = x1 / x2;
        
        System.out.println("Sum: " + s);
        System.out.println("Difference: " + d);
        System.out.println("Product: " + p);
        System.out.println("Quotient: " + q);
        
        input.close();
    }
}
