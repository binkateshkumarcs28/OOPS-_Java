//W.A.P that print all real solutions of a quadratic equation ax2+bx+c=0. read a,b,c and use a quadratic formula 
//if the discriminant (b2-4ac) is negative, Display a message stating that there are no real solution (LAB practical) {Code6}

import java.util.Scanner;

public class Quadratic_Equation_Solutions {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read coefficients
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();
        // Check for quadratic equation
        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
        } else {
            // Calculate discriminant
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                // Two distinct real roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two real and distinct solutions:");
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            } else if (discriminant == 0) {
                // One real root
                double root = -b / (2 * a);
                System.out.println("One real solution:");
                System.out.println("Root = " + root);
            } else {
                // No real solution
                System.out.println("No real solutions exist (Discriminant < 0).");
            }
        }

        sc.close();
    }
}
