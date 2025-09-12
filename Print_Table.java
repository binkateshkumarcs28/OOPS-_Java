// W.A.P to print the table of any no. n whre n is the positive integer

import java.util.Scanner;

public class Print_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Multiplication Table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Please enter a positive integer!");
        }

        sc.close();
    }
}
