//Write a Java program to compute the distance between two points on the surface of earth.
//        Distance between the two points [ (x1,y1) & (x2,y2)]
//        d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//        Radius of the earth r = 6371.01 Kilometers
//        Input Data:
//        Input the latitude of coordinate 1: 25
//        Input the longitude of coordinate 1: 35
//        Input the latitude of coordinate 2: 35.5
//        Input the longitude of coordinate 2: 25.5
//        Expected Output
//
//        The distance between those points is: 1480.0848451069087 km

import java.util.Scanner;

public class Distance_2_Points_Earth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the latitude of coordinate 1: ");
        double a = input.nextDouble();

        System.out.println("Input the longitude of coordinate 1: ");
        double b = input.nextDouble();

        System.out.println("Input the latitude of coordinate 2: ");
        double c = input.nextDouble();

        System.out.println("Input the longitude of coordinate 2: ");
        double d = input.nextDouble();

        System.out.println("The distance between those points is: "+distancePoints(a,b,c,d));
    }

    public static double distancePoints(double a, double b, double c, double d)
    {
        a = Math.toRadians(a);
        b = Math.toRadians(b);
        c = Math.toRadians(c);
        d = Math.toRadians(d);

        double r = 6371.01;

        return r * Math.acos((Math.sin(a) * Math.sin(b) + Math.cos(a) * Math.cos(b) * Math.cos(c - d)));
    }


}
