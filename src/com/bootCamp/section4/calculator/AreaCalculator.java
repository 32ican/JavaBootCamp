package com.bootCamp.section4.calculator;

public class AreaCalculator {
    public static void main(String[] args) {
        printAreaCicle(5);
        printAreaSquare(5);
    }

    public static double areaSquare(double side){
        if (side <=0) {
            System.out.println("Impossible: Please, write a positive number");
            System.exit(0);
        }
        double  area = Math.pow (side,2);
        return area;
    }

    public static void printAreaSquare (double side){
        System.out.println("The area of the square is: " + areaSquare(side));
    }


    public static double circleArea(double raduis){
        if (raduis <=0) {
            System.out.println("Impossible: Please, write a positive number");
            System.exit(0);
        }
        double  area = Math.PI * Math.pow(raduis, 2);
        return area;
    }

    public static void printAreaCicle (double radius){
        System.out.println("The area of the Cicle is: " + circleArea(radius));
    }
}
