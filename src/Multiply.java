//Write a Java program that takes two numbers as input and display the product of two numbers.
//        Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = input.nextInt();
        System.out.println("Enter Second Number: ");
        int b = input.nextInt();

        int mul = a*b;

        System.out.println(a+" * "+b+" = "+mul);
    }
}
