// W.A.P to print all the odd no. in the range of 1 to n where n is the user input

import java.util.Scanner;

public class Odd_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Odd numbers from 1 to " + n + " are:");

        // Loop to print odd numbers
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
