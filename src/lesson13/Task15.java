package lesson13;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Task15 {
    public static void main(String[] args) {
        List<String> words = List.of("кот", "собака", "кот", "дом", "собака", "кот", "ёж");
        Map<Integer, List<String>> collect = words.stream()
                .collect(Collectors.groupingBy(x -> x.length()));

        System.out.println("Сгруппированные слова по длине: ");
        collect.forEach((key, value) -> System.out.println(key + " = " + value));

        Map<Boolean, List<String>> collectAfterThree = words.stream().collect(Collectors.partitioningBy(x -> x.length() > 3));

        System.out.println("Длина слова больше 3? ");
        collectAfterThree.forEach((key, value) -> System.out.println(key + " = " + value));

        Map<String, Long> collectCounting = words.stream()
                .collect(Collectors.groupingBy(x -> x, counting()));

        System.out.println("Сколько раз встречается каждое слово: ");
        collectCounting.forEach((key, value) -> System.out.println(key + " = " + value));


    }
}
