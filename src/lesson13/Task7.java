package lesson13;

import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> names = List.of("Аня", "Борис", "Аня", "Вера", "Борис", "Глеб");

        System.out.println("Список без дубликатов: ");
        names.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("Список отсортированный по алфавиту: ");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Отсортированный список по алфавиту, без дубликатов и только 2 первых элемента:");
        names.stream()
                .distinct()
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("Список отсортированный по длине: ");
        names.stream()
                .sorted((x1, x2) -> (x1.length() > x2.length()) ? 1 : (x1.length() == x2.length()) ? 0 : -1)
                .forEach(System.out::println);
    }
}
