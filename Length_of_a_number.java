//W.A.P to calculate the length of any no. input by user  

import java.util.Scanner;

public class Length_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Handle negative numbers
        num = Math.abs(num);

        int count = 0;

        // Special case: if number is 0, length is 1
        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10;  // Remove last digit
                count++;         // Count digits
            }
        }

        System.out.println("The length of the number is: " + count);

        sc.close();
    }
}

