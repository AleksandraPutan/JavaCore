package lesson12.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CommonRepository {

    public static int count(File file, String delimiter) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int id = 0;
            while ((line = reader.readLine()) != null) {
                String[] ms = line.split(delimiter);
                id = Integer.parseInt(ms[0]);
            }
            return id;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String readAllItems(File file) {
        StringBuilder str = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            if (file.exists() && file.isFile() && file.length() == 0) {
                return "Файл пуст или не создан.\n";
            } else {
                while ((line = reader.readLine()) != null) {
                    str.append(line + "\n");
                }
            }
            return str.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String readById(File file, int id, String delimiter) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] ms = line.split(delimiter);
                if (Integer.parseInt(ms[0]) == id) {
                    return line;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
