//Write a Java program and compute the sum of the digits of an integer.
//        Input Data:
//        Input an integer: 25
//        Expected Output
//
//        The sum of the digits is: 7

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int a = input.nextInt();

        System.out.println("The sum of the digits is: "+sumDigits(a));

    }

    public static int sumDigits(int a) {
       int sum = 0;
       while (a!=0)
       {
           sum = sum + a%10;
           a = a/10;
       }
        return sum;
    }
}
