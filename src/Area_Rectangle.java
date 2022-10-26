//Write a Java program to print the area and perimeter of a rectangle.
//        Test Data:
//        Width = 5.5 Height = 8.5
//
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20

import java.util.Scanner;

public class Area_Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Width: ");
        double w = input.nextDouble();
        System.out.println("Enter Height: ");
        double h = input.nextDouble();

        double area = (w*h);
        double perimeter = 2*(w+h);

        System.out.println("Area is "+w+" * "+h+" = "+area);
        System.out.println("Perimeter is 2 * ("+w+" + "+h+") ="+perimeter);
    }
}
