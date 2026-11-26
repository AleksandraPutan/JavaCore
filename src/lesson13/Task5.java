package lesson13;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Вывод только четных чисел: ");
        numbers.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Вывод чисел >5: ");
        numbers.stream()
                .filter(x -> x > 5)
                .forEach(System.out::println);

        System.out.println("Вывод нечётных чисел, которые меньше 7: ");
        numbers.stream()
                .filter(x -> x % 2 != 0)
                .filter(x -> x < 7)
                .forEach(System.out::println);


        System.out.println("Вывод чисел, которые делятся на 3: ");
        numbers.stream()
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);

        long count = numbers.stream()
                .filter(x -> x > 5)
                .count();
        System.out.println("Количество чисел больше 5: " + count);
    }
}
