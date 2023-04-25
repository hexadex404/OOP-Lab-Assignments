import java.util.Scanner;

public class EquationSolver{
    public static void solveFDE() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The equation has the form ax + b = 0.");

        System.out.print("Enter the coefficient a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter the coefficient b: ");
        double b = input.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinite solutions.");
            } else {
                System.out.println("The equation has no solutions.");
            }
        } else {
            double x = -b / a;
            System.out.println("The solution is x = " + x);
        }
        
        input.close();
    }
    
    public static void solveSFE() {
        Scanner input = new Scanner(System.in);

        System.out.print("The system of equation has the form a11x1 + a12x2 = b1; a21x1 + a22x2 = b2.");
        
        System.out.print("Enter the coefficient a11: ");
        double a11 = input.nextDouble();
        
        System.out.print("Enter the coefficient a12: ");
        double a12 = input.nextDouble();
        
        System.out.print("Enter the constant term b1: ");
        double b1 = input.nextDouble();
        
        System.out.print("Enter the coefficient a21: ");
        double a21 = input.nextDouble();
        
        System.out.print("Enter the coefficient a22: ");
        double a22 = input.nextDouble();
        
        System.out.print("Enter the constant term b2: ");
        double b2 = input.nextDouble();
        
        double det = a11 * a22 - a12 * a21;
        
        if (det == 0) {
            if (b1 == b2) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solutions.");
            }
        } else {
            double x = (b1 * a22 - b2 * a12) / det;
            double y = (a11 * b2 - a21 * b1) / det;
            System.out.println("The solution is x = " + x + ", y = " + y);
        }
        
        input.close();
    }
    
    public static void solveSDE() {
        Scanner input = new Scanner(System.in);

        System.out.print("The equation has the form ax^2 + bx + c = 0.");
        
        System.out.print("Enter the coefficient a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter the coefficient b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter the coefficient c: ");
        double c = input.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("The equation has infinitely many solutions.");
                } else {
                    System.out.println("The equation has no solutions.");
                }
            } else {
                double x = -c / b;
                System.out.println("The solution is x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                System.out.println("The equation has no real solutions.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The solution is x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The solutions are x1 = " + x1 + " and x2 = " + x2);
            }
        }    
        
            input.close();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. First-degree equation with one variable");
        System.out.println("2. System of first-degree equations with two variables");
        System.out.println("3. Second-degree equation with one variable");
        System.out.print("Choose an equation(s) type to solve for: ");
        
        int option = input.nextInt();
        boolean validInput = true;
        
        do {
            switch (option) {
                case 1:
                    solveFDE();
                    break;
                case 2:
                    solveSFE();
                    break;
                case 3:
                    solveSDE();
                    break;
                default:
                    validInput = false;
                    System.out.print("Invalid option. Please enter a valid number: ");
                    option = input.nextInt();
                    
            }
        } while (!validInput);
        input.close();
    }
}    