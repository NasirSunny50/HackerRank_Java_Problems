//Write a Java program to reverse a string.
//        Input Data:
//        Input a string: The quick brown fox
//        Expected Output
//
//        Reverse string: xof nworb kciuq ehT

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a string: ");
        char[] a = input.nextLine().toCharArray();

        System.out.println("Reverse string: ");

        for (int i= a.length-1; i>=0; i--)
        {
            System.out.print(a[i]);
        }
        System.out.print("\n");
    }
}
