package org.example.Homework.HWException2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные в формате: Фамилия Имя Отчество, дата рождения, номер телефона, пол");
            String input = scanner.nextLine();

            Person person = DataParser.parseData(input);
            FileManager.savePersonToFile(person);

            System.out.println("Данные успешно сохранены в файл!");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
