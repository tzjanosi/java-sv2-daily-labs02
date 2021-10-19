package day02;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle=new Rectangle(5.3,10.2);
        System.out.println("Területe:"+rectangle.calculateArea());

    }
}
