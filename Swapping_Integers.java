//W.A.P to swap two integers i) using third variable  ii) without using third variable


import java.util.Scanner;

public class Swapping_Integers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input two positive integers
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("\nBefore Swapping: a = " + a + ", b = " + b);

            // 1. Swapping using 3rd variable
            int temp = a;
            a = b;
            b = temp;
            System.out.println("After swapping using 3rd variable: a = " + a + ", b = " + b);

            // Reset values for 2nd method
            System.out.print("\nEnter first number again: ");
            a = sc.nextInt();
            System.out.print("Enter second number again: ");
            b = sc.nextInt();

            System.out.println("\nBefore Swapping: a = " + a + ", b = " + b);

            // 2. Swapping without using 3rd variable
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After swapping without 3rd variable: a = " + a + ", b = " + b);
        }
    }
}

