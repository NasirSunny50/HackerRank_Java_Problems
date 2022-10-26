//Write a Java program to divide two numbers and print on the screen.
//        Test Data :
//        50/3
//        Expected Output :
//        16

import java.util.Scanner;

public class Divide {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input First Number: ");
        int a = input.nextInt();
        System.out.println("Input Second Number: ");
        int b = input.nextInt();

        int div = a/b;
        System.out.println(div);
    }
}
