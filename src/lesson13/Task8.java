package lesson13;

import java.util.List;
import java.util.Optional;

public class Task8 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        long count = numbers.stream().count();
        System.out.println("Количество элементов: " + count);
        Optional<Integer> min = numbers.stream().min((x, y) -> (x > y) ? 1 : (x == y) ? 0 : -1);
        System.out.println("Минимальное число: " + min.get());
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println("Максимальное число: " + max.get());
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Сумма всех чисел: " + sum);
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Среднее число: " + sum / count);


    }
}
