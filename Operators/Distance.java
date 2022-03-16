package Operators;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("y = ");
        double y = Double.parseDouble(scanner.nextLine());
        double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Дистанцията е: " + result);
    }
}
