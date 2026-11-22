package lesson12.repository;

import java.io.*;

public class ProductRepository {

    public static void writeProductInFile(File file, String text) {

        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            fileOutputStream.write((text + "\n").getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteProductInFile(File fileProducts, String str) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileProducts)) {
            fileOutputStream.write(str.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readByNameProduct(File file, String name, String delimiter) {
        boolean inValue = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] ms = line.split(delimiter);
                if ((ms[1].toString().equals(name))) {
                    System.out.println(line);
                    inValue = true;
                }
            }
            if (inValue == false){
                System.out.println("Товар с таким названием не найден!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
