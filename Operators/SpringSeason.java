package Operators;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете месец: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете ден: ");
        int day = Integer.parseInt(scanner.nextLine());

        System.out.println(month == 3 && day >= 20 || month == 4 || month == 5 || day <= 20 && month == 6 ? "Вярно" : "Грешно");
    }
}
