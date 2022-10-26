//Write a Java program to add two binary numbers.
//
//        In digital electronics and mathematics, a binary number is a number expressed in the base-2 numeral system or binary numeral system. This system uses only two symbols: typically 1 (one) and 0 (zero).
//
//Input Data:
//        Input first binary number: 10
//        Input second binary number: 11
//        Expected Output
//
//        Sum of two binary numbers: 101


import java.util.Scanner;

public class Add_Binary {

    public static void main(String[] args) {

        int[] sum = new int[20];
        int r = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        long b1 = input.nextLong();

        System.out.println("Input second binary number: ");
        long b2 = input.nextLong();

        int i=0;
        while (b1 != 0 || b2 != 0)
        {
            sum[i++] = (int)((b1%10 + b2%10 + r)%2);
            r = (int)((b1%10 + b2%10 + r)/2);
            b1 = b1 /10;
            b2 = b2/10;
        }
        if(r != 0)
        {
            sum[i++] = r;
        }
        --i;

        System.out.println("Sum of two binary numbers: ");
        while (i>=0)
        {
            System.out.println(sum[i--]);
        }

    }
}
