package lesson12.service;

import lesson12.main.Main;
import lesson12.model.Product;
import lesson12.repository.CommonRepository;
import lesson12.repository.ProductRepository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import static lesson12.ui.ConsoleMenu.idDelete;

public class ProductService {

    public static void writeProduct(File fileProducts, String str) {
        String mas[] = str.split(";");
        Product product = new Product(Main.idProduct, mas[0], LocalDate.parse(mas[1]));
        String text = product.toString();
        Main.idProduct++;
        ProductRepository.writeProductInFile(fileProducts, text);
    }

    public static void deleteProduct(File fileProducts) {
        int deleteId = idDelete(fileProducts);
        if (CommonRepository.readById(fileProducts, deleteId, ";") != null) {
            StringBuilder str = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileProducts))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] ms = line.split(";");
                    if (Integer.parseInt(ms[0]) != deleteId) {
                        str.append(line);
                        str.append("\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(str);
            ProductRepository.deleteProductInFile(fileProducts, str.toString());
        } else {
            System.out.println("Не найдено такого индекса! Введите еще раз");
            deleteProduct(fileProducts);
        }
    }

}
