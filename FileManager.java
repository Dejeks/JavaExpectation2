package org.example.Homework.HWException2;

import java.io.FileWriter;
import java.io.IOException;


public class FileManager {
    public static void savePersonToFile(Person person) {
        try (FileWriter writer = new FileWriter(person.getLastName() + ".txt", true)) {
            writer.write(person.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
