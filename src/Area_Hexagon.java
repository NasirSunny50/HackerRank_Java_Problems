//Write a Java program to compute the area of a hexagon.
//        Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//        where s is the length of a side
//        Input Data:
//        Input the length of a side of the hexagon: 6
//        Expected Output
//
//        The area of the hexagon is: 93.53074360871938

import java.util.Scanner;

public class Area_Hexagon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon: ");
        double a = input.nextDouble();
        System.out.println("The area of the hexagon is: "+hexagonArea(a));
    }

    public static double hexagonArea(double a)
    {
        return ((6 * Math.pow(a,2))/(4*Math.tan(Math.PI/6)));
    }

}

