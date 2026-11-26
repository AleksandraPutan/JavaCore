package lesson13;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> words = List.of("кот", "собака", "дом", "машина");

        System.out.println("Вывод длин всех слов: ");
        words.stream()
                .mapToInt(x -> x.length())
                .forEach(System.out::println);

        System.out.println("Вывод слов в верхнем регистре: ");
        words.stream()
                .map(x -> x.toUpperCase())
                .forEach(System.out::println);

        System.out.println("Вывод слов с ! в конце: ");
        words.stream()
                .map(x -> x + "!")
                .forEach(System.out::println);

        System.out.println("Вывод слово -> длина: ");
        words.stream()
                .map(x -> x + " -> " + x.length())
                .forEach(System.out::println);
    }
}
