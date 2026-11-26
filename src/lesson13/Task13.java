package lesson13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task13 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 100);
        System.out.println("Числа от 1 до 10: ");
        intStream.filter(x -> x < 11)
                .forEach(System.out::println);

        IntStream intStream1 = IntStream.range(1, 20);
        System.out.println("Четные числа от 1 до 20: ");
        intStream1.filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        IntStream intStream2 = IntStream.range(1, 100);
        int sum = intStream2
                .sum();
        System.out.println("Сумма чисел от 1 до 100: " + sum);

        IntStream intStream3 = IntStream.range(1, 10);
        int sumSq = intStream3
                .map(x -> x * x)
                .sum();
        System.out.println("Сумма квадратов от 1 до 10: " + sumSq);

        IntStream intStream4 = IntStream.range(1, 5);
        List<Integer> lists = intStream4
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Вывод чисел из List: ");
        for (Integer list : lists) {
            System.out.println(list);
        }

    }
}
