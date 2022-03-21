package Operators;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете месец: ");
        byte month = Byte.parseByte(scanner.nextLine());
        System.out.print("Въведете ден: ");
        byte day = Byte.parseByte(scanner.nextLine());

        System.out.println(month == 3 && day >= 20 && day <= 31 || month == 4 && day >= 1 && day <= 30 || month == 5 && day >= 1 && day <= 31 || day >= 1 && day <= 20 && month == 6 ? "Вярно" : "Грешно");
    }
}
