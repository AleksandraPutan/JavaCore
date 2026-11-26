package lesson13.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.print("Вывод hello с применением upper: ");
        Function<String, String> function = (Task4::upper);
        System.out.println(function.apply("hello"));

        Predicate<String> predicate = (Task4::isShort);
        System.out.println("\nМетод isShort для строки кот: " + predicate.test("кот"));
        System.out.println("Метод isShort для строки собака: " + predicate.test("собака"));

        System.out.println("\nВывод строк через Consumer:");
        Consumer<String> consumer = (System.out::println);
        consumer.accept("Дом");
        consumer.accept("Окно");
        consumer.accept("Газон");

        System.out.println("\nВывод отсортированного List через String::compareToIgnoreCase");
        List<String> words = new ArrayList<>(List.of("яблоко", "кот", "собака", "дом", "машина"));
        words.sort(String::compareToIgnoreCase);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
