package lesson12.main;

import lesson12.repository.CommonRepository;
import lesson12.ui.ConsoleMenu;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final File fileOrders = Path.of("C:", "Users", "DeadMoroz", "Desktop", "JavaCore", "JavaCore", "src", "lesson12", "resources", "orders.txt").toFile();
    public static final File fileProducts = Path.of("C:", "Users", "DeadMoroz", "Desktop", "JavaCore", "JavaCore", "src", "lesson12", "resources", "products.txt").toFile();
    public static int idProduct = (CommonRepository.count(fileProducts, ";")) + 1;
    public static int idOrder = (CommonRepository.count(fileOrders, "/") + 1);

    public static void main(String[] args) {
        ConsoleMenu.printMainMenu(fileProducts, fileOrders);
    }

}
