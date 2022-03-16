package Operators;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете височината (м.): ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете теглото (кг.): ");
        double weight = Double.parseDouble(scanner.nextLine());
        double bodyMessIndex = weight / Math.pow(height, 2);
        System.out.printf("Индексът на телесните мазнини е: %.2f", bodyMessIndex);
    }
}
