//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want to input?:");
        double n = input.nextInt();

        double a = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Input number: ");
            a = input.nextInt()+1;
        }

        double avg = (a / n);
        System.out.println(avg);

    }
}
