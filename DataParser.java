package org.example.Homework.HWException2;

import java.util.Scanner;

public class DataParser {
    public static Person parseData(String input) throws IllegalArgumentException {
        String[] data = input.split(",");
        if (data.length != 4) {
            throw new IllegalArgumentException("Неверное количество данных. Ожидается: Фамилия Имя Отчество,дата рождения,номер телефона,пол");
        }

        String[] nameParts = data[0].split(" ");
        if (nameParts.length != 3) {
            throw new IllegalArgumentException("Неверный формат ФИО. Ожидается: Фамилия Имя Отчество");
        }

        String lastName = nameParts[0];
        String firstName = nameParts[1];
        String middleName = nameParts[2];
        String birthDate = data[1];
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат номера телефона. Ожидается целое беззнаковое число без форматирования.");
        }

        char gender = data[3].charAt(0);
        if (gender != 'ж' && gender != 'м') {
            throw new IllegalArgumentException("Неверный формат пола. Ожидается символ латиницей ж или м.");
        }

        return new Person(firstName, lastName, middleName, birthDate, phoneNumber, gender);
    }
}
