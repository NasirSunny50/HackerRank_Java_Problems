//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5

import java.util.Scanner;

public class Sum_Sub_Mul_Div_Rem {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = input.nextInt();
        System.out.println("Input second number: ");
        int b = input.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;

        System.out.println(a+" + "+b+" = "+sum);
        System.out.println(a+" - "+b+" = "+sub);
        System.out.println(a+" * "+b+" = "+mul);
        System.out.println(a+" / "+b+" = "+div);
        System.out.println(a+" % "+b+" = "+rem);

    }
}