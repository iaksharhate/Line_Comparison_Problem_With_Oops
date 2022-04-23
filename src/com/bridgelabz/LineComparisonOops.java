package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonOops {

    static String strLength1;
    static String strLength2;

    public double calculateLineLength(){
        int x1, x2, y1, y2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 value: ");
        x1 = sc.nextInt();
        System.out.println("Enter x2 value: ");
        x2 = sc.nextInt();
        System.out.println("Enter y1 value: ");
        y1 = sc.nextInt();
        System.out.println("Enter y2 value: ");
        y2 = sc.nextInt();

        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line between points " + "(" + x1 + "," + y1 + ")," +
                "(" + x2 + "," + y2 + ") = " + length);
        return length;
    }

    public void qualityOfLines(){
        System.out.println("Enter coordinates for first line: ");
        strLength1 = Double.toString(calculateLineLength());

        System.out.println("Enter coordinates for second line: ");
        strLength2 = Double.toString(calculateLineLength());

        System.out.println(strLength1.equals(strLength2));
    }

    public void compareTwoLines(){

        System.out.println("Enter coordinates for first line: ");
        strLength1 = Double.toString(calculateLineLength());

        System.out.println("Enter coordinates for second line: ");
        strLength2 = Double.toString(calculateLineLength());

        System.out.println(strLength1.compareTo(strLength2));
    }
}
