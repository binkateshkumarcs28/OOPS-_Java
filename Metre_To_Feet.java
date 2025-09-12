//W.A.P to read a no. in metre and convert it to feet and display the result (LAB Practical) {Code5}

import java.util.Scanner;

public class Metre_To_Feet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: distance in metres
        System.out.print("Enter distance in metres: ");
        double metres = sc.nextDouble();

        // 1 metre = 3.28084 feet
        double feet = metres * 3.28084;

        // Output: result in feet
        System.out.println(metres + " metre(s) is equal to " + feet + " feet.");

        sc.close();
    }
}
