package lesson12.service;

import lesson12.main.Main;
import lesson12.model.Order;
import lesson12.model.Product;
import lesson12.repository.CommonRepository;
import lesson12.repository.OrderRepository;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static lesson12.ui.ConsoleMenu.idDelete;

public class OrderService {

    public static void writeProductInOrderMenu(List<Integer> productList, File fileProducts, File fileOrders) {
        List<Product> productsInOrder = new ArrayList<>();
        if (!productList.isEmpty()) {
            int i = 0;
            try {
                for (i = 0; i < productList.size(); i++) {
                    String result = CommonRepository.readById(fileProducts, productList.get(i), ";");
                    System.out.println(result);
                    String[] ms = result.split(";");
                    LocalDate localDate = LocalDate.parse(ms[2]);
                    Product product = new Product(Integer.parseInt(ms[0]), ms[1], localDate);
                    productsInOrder.add(product);
                }
            } catch (NullPointerException e) {
                System.out.println("Товар под индексом " + productList.get(i) + " не найден, поэтому не добавлен в заказ");
            }

            Order order = new Order(Main.idOrder, productsInOrder, LocalDate.now());
            Main.idOrder++;
            OrderRepository.writeOrderInFile(fileOrders, order);
        } else {
            System.out.println("Вы не добавили продукты в заказ!");
        }
    }

    public static void deleteOrder(File fileOrders) {
        while (true) {

            int id = idDelete(fileOrders);
            if (CommonRepository.readById(fileOrders, id, "/") != null) {
                StringBuilder str = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new FileReader(fileOrders))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] ms = line.split("/");
                        if (Integer.parseInt(ms[0]) != id) {
                            str.append(line);
                            str.append("\n");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Заказ удалён.");
                OrderRepository.deleteOrderFile(fileOrders, str.toString());
                return;

            } else {
                System.out.println("Не найдено такого индекса! Введите еще раз");
            }
        }
    }
}

