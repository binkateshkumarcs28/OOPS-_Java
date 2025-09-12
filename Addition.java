//WAP to print addition of 2 numbers (with Scanner) (LAB Practical) {Code3}

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Arithmetic operations
        System.out.println("Addition: " + (a + b));
         sc.close(); // Closing scanner

    }
}
