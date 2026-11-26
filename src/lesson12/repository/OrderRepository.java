package lesson12.repository;

import lesson12.model.Order;

import java.io.*;

public class OrderRepository {

    public static void writeOrderInFile(File fileOrders, Order order) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileOrders, true)) {
            fileOutputStream.write(order.toString().getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteOrderFile(File fileOrders, String str) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileOrders)) {
            fileOutputStream.write(str.getBytes());
            System.out.println("Заказ успешно добавлен");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
