package lesson12.ui;

import lesson12.exception.InvalidProductDateException;
import lesson12.repository.ProductRepository;
import lesson12.service.OrderService;
import lesson12.service.ProductService;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import static lesson12.main.Main.*;
import static lesson12.repository.CommonRepository.readAllItems;
import static lesson12.repository.CommonRepository.readById;

public class ConsoleMenu {

    public static final String MAIN_MENU = """
            === ГЛАВНОЕ МЕНЮ===
            1. Работа с товарами
            2. Работа с заказами
            0. Выход
            Выберите пункт:
            """;

    public static final String PRODUCT_MENU = """
            === ТОВАРЫ ===
            1. Показать все товары
            2. Добавить товар
            3. Удалить товар
            4. Поиск продукта по названию
            0. Назад в главное меню
            Выберите пункт:
            """;

    public static final String ORDER_MENU = """
            === ЗАКАЗЫ ===
            1. Показать все заказы
            2. Добавить заказ
            3. Удалить заказ
            0. Назад в главное меню
            Выберите пункт:
            """;

    public static final String PRODUCT_IN_ORDER = """
            === ДОБАВЛЕНИЕ ТОВАРОВ В ЗАКАЗ ===
            1. Добавить товар
            2. Заказ завершен
            Выберите пункт:
            """;

    public static void printOrderMenu(File fileProduct, File fileOrders) {
        while (true) {
            System.out.println(ConsoleMenu.ORDER_MENU);
            try {
                int choice = SCANNER.nextInt();
                if (choice >= 0 && choice <= 3) {
                    switch (choice) {
                        case 1:
                            System.out.println("Показать все заказы");
                            System.out.println(readAllItems(fileOrders));
                            break;
                        case 2:
                            System.out.println("Добавить заказ");
                            OrderService.writeProductInOrderMenu(inputOrder(), fileProduct, fileOrders);
                            break;
                        case 3:
                            System.out.println("Удалить заказ");
                            OrderService.deleteOrder(fileOrders);
                            break;
                        case 0:
                            System.out.println("Выход");
                            return;
                    }
                } else {
                    System.out.println("Цифры только от 0 до 4!!");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + " ВВедите снова!");
                SCANNER.next();
            }
        }
    }

    public static void printProductMenu(File fileProduct) {
        while (true) {
            System.out.println(ConsoleMenu.PRODUCT_MENU);
            try {
                int choice = SCANNER.nextInt();
                if (choice >= 0 && choice <= 4) {
                    switch (choice) {
                        case 1:
                            System.out.println("Показать все товары");
                            System.out.println(readAllItems(fileProduct));
                            break;
                        case 2:
                            System.out.println("Добавить товар");
                            ProductService.writeProduct(fileProduct, inputProduct());
                            break;
                        case 3:
                            System.out.println("Удалить товар");
                            ProductService.deleteProduct(fileProduct);
                            break;
                        case 4:
                            System.out.println("Поиск продукта по названию");
                            System.out.println("Введите название товара");
                            String name = SCANNER.next();
                            ProductRepository.readByNameProduct(fileProduct,name, ";");
                        case 0:
                            System.out.println("Выход");
                            return;
                    }
                } else {
                    System.out.println("Цифры только от 0 до 3!!");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + " ВВедите снова!");
                SCANNER.next();
            }
        }
    }

    public static void printMainMenu(File fileProduct, File fileOrder) {
        boolean inValue = false;
        while (inValue != true) {
            System.out.println(ConsoleMenu.MAIN_MENU);
            try {
                int choice = SCANNER.nextInt();
                if (choice >= 0 && choice < 3) {
                    switch (choice) {
                        case 1:
                            printProductMenu(fileProduct);
                            break;
                        case 2:
                            printOrderMenu(fileProduct, fileOrder);
                            break;
                        case 0:
                            System.out.println("До свидания!!!");
                            System.exit(0);
                    }
                } else {
                    System.out.println("Цифры только от 0 до 2");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + " ВВедите снова!");
                SCANNER.next();
            }
        }
    }

    public static String inputProduct() {
        StringBuilder str = new StringBuilder();
        System.out.println("Введите название продукта");
        String name = SCANNER.next();
        str.append(name + ";");
        while (true) {
            try {
                System.out.println("Введите дату в формате dd-MM-yyyy");
                String date = SCANNER.next();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate localDate = LocalDate.parse(date, dtf);
                LocalDate earlerLocalDate = LocalDate.of(2016, 1, 1);
                try {
                    if (localDate.isAfter(earlerLocalDate) && localDate.isBefore(LocalDate.now().plusDays(1))) {
                        str.append(localDate);
                        return str.toString();
                    } else {
                        throw new InvalidProductDateException("Неверная дата");
                    }
                } catch (InvalidProductDateException e) {
                    System.out.println("Введите дату после 2016 и не позднее сегодняшнего дня.");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Неверный формат даты");
            }
        }
    }

    public static List<Integer> inputOrder() {
        List<Integer> array = new ArrayList<>();
        while (true) {
            System.out.println(ConsoleMenu.PRODUCT_IN_ORDER);
            try {
                int choice = SCANNER.nextInt();
                if (choice == 1 || choice == 2) {
                    switch (choice) {
                        case 1:
                            boolean inValue = false;
                            while (!inValue) {
                                try {
                                    System.out.println("Добавить товар");
                                    System.out.println(readAllItems(fileProducts));
                                    System.out.println("Введите id товара, который хотите добавить");
                                    int idProductIn = SCANNER.nextInt();
                                    String isProduct = readById(fileProducts, idProductIn, ";");
                                    if (isProduct != null) {
                                        array.add(idProductIn);
                                        inValue = true;
                                    } else System.out.println("Такого товара не найдено");
                                } catch (InputMismatchException e) {
                                    System.out.println("Введите цифру!");
                                    SCANNER.next();
                                }
                            }
                            break;
                        case 2:
                            return array;
                    }
                } else {
                    System.out.println("Цифры только 1 или 2!!");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + " ВВедите снова!");
                SCANNER.next();
            }
        }
    }

    public static int idDelete(File file) {
        while (true) {
            try {
                System.out.println(readAllItems(file));
                System.out.println("Введите id для удаления:");
                int id = SCANNER.nextInt();
                return id;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + " ВВедите снова!");
                SCANNER.next();
            }
        }
    }
}
