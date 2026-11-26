package lesson13;

import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        List<String> fruits = List.of("яблоко", "банан", "апельсин", "киви");

        System.out.println("Строка через запятую: " + fruits
                .stream()
                .collect(Collectors.joining(",")));

        System.out.println("Строка через запятую c префиксом и постфиксом: " + fruits
                .stream()
                .collect(Collectors.joining(",", "[", "]")));

        System.out.println("Фрукты длиннее 5 букв: " + fruits
                .stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.joining(",", "[", "]")));

        System.out.println("Строка заглавными буквами через пробел: " + fruits
                .stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(" ")));
    }
}
