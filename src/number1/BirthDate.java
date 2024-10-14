package number1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthDate {
    public static void main(String[] args) {
        System.out.println("Enter date of birth. Format dd/MM/yyyy: ");

        Scanner scanner = new Scanner(System.in);

        String birthDateStr = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(birthDate);

        System.out.println("You will turn 100 years old on: ");
        System.out.println(birthDate.plusYears(100));

    }
}

/* Задача 1:
Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
когда пользователю исполнится 100 лет. Использовать Date/Time API */