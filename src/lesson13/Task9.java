package lesson13;

import java.util.List;
import java.util.Optional;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().
                reduce((acc, x) -> acc + x);
        System.out.println("Сумма чисел через reduce: " + sum.get());

        Optional<Integer> prod = numbers.stream().
                reduce((acc, x) -> acc * x);
        System.out.println("Произведение всех чисел: " + prod.get());

        Optional<String> text = numbers.stream().
                map((x) -> String.valueOf(x))
                .reduce((acc, x) -> acc + "-" + x);
        System.out.println("Строка из чисел: " + text.get());


    }
}
