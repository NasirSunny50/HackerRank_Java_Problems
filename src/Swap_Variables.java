//Write a Java program to swap two variables.

import java.util.Scanner;

public class Swap_Variables {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = input.nextInt();

        System.out.println("Input first number: ");
        int b = input.nextInt();

        System.out.println("BEFORE SWAP a = "+a+" b = "+b);

        int temp = a;
        a=b;
        b=temp;

        System.out.println("AFTER SWAP a = "+a+" b = "+b);

    }
}
