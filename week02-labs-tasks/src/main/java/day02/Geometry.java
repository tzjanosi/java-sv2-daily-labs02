package day02;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in length of the first side:");
        double side1 = scanner.nextDouble();
        System.out.println("Type in length of the second side:");
        double side2 = scanner.nextDouble();


        Rectangle rectangle=new Rectangle(side1,side2);
        System.out.println("Területe:"+rectangle.calculateArea());

    }
}
