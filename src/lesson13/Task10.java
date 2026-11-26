package lesson13;

import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        System.out.println("Все ли числа чётные в numbers: " + numbers
                .stream()
                .allMatch(x -> x % 2 == 0));

        System.out.println("Правда ли, что хотя бы одно число > 8 в numbers: " + numbers
                .stream()
                .anyMatch(x -> x > 8));

        System.out.println("Правда ли, что нет ни одного отрицательное число в numbers: " + numbers
                .stream()
                .noneMatch(x -> x < 0));

        List<Integer> numbers2 = List.of(1, 3, 5, 7);
        System.out.println("Все ли числа чётные в numbers2: " + numbers2
                .stream()
                .allMatch(x -> x % 2 == 0));

        System.out.println("Правда ли, что хотя бы одно число > 8 в numbers2: " + numbers2
                .stream()
                .anyMatch(x -> x > 8));

        System.out.println("Правда ли, что нет ни одного отрицательное число в numbers2: " + numbers2
                .stream()
                .noneMatch(x -> x < 0));
    }
}
