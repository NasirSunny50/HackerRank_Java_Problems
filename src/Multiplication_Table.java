//Write a Java program that takes a number as input and prints its multiplication table upto 10.
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80

import java.util.Scanner;

public class Multiplication_Table {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = input.nextInt();

        for(int i=0; i<10; i++)
        {
            int mul = a * (i+1);
            System.out.println(a+" * "+(i+1)+" = "+mul);
        }
    }
}
