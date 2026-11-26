package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Задача 3");
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        Function<Integer, Integer> function = (number) -> {
            return number * number;
        };
        System.out.println("Числа в квадрате:");
        for (Integer num : numbers) {
            System.out.print(function.apply(num) + "; ");
        }

        Predicate<Integer> predicate = (number) -> number % 2 == 0;
        System.out.println("\nЧётное ли число:");
        for (Integer num : numbers) {
            System.out.print(predicate.test(num) + "; ");
        }

        System.out.println("\nВывод строк с префиксом >>");
        List<String> words = new ArrayList<>(List.of("яблоко", "кот", "собака", "дом", "машина"));
        Consumer<String> printWithPrefix = (string) -> System.out.println(">> " + string);
        for (String word : words) {
            printWithPrefix.accept(word);
        }

        System.out.println("Вызов ок 3 раза:");
        Supplier<String> supplier = () -> "Ок";
        for (int i = 0; i < 3; i++) {
            System.out.println(supplier.get() + " ");
        }
    }
}
