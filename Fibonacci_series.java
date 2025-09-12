//W.A.P to find the Fibonacci series using non recursive functions (Lab Practical) {Code7}

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();

            // First two terms of Fibonacci series
            int first = 0, second = 1;

            System.out.print("Fibonacci Series: ");

            // Loop to generate the Fibonacci series
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                int next = first + second;
                first = second;
                second = next;
            }
        }
    }
}
