package lesson13;

import java.util.List;
import java.util.Optional;

public class Task12 {
    public static void main(String[] args) {
        List<String> words = List.of("стол", "окно", "дверь", "шкаф");

        Optional<String> withD = words.stream().filter(x -> x.startsWith("д")).findFirst();
        withD.ifPresentOrElse(
                d -> System.out.println("Первое найденное слово на букву д: " + d),
                () -> System.out.println("Слово на букву д не найдено")
        );

        Optional<String> withYa = words.stream().filter(x -> x.startsWith("я")).findFirst();
        withYa.ifPresentOrElse(
                d -> System.out.println("Первое найденное слово на букву я: " + d),
                () -> System.out.println("Слово на букву я не найдено")
        );

        Task12.parse("123");
        Task12.parse("abc");

    }

    static Optional<Integer> parse(String s) {
        Optional<Integer> i;
        try {
            i = Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            i = Optional.empty();
        }
        i.ifPresentOrElse(
                a -> System.out.println("Строка является целым числом: " + a),
                () -> System.out.println("Строка не является числом")
        );
        return i;
    }
}
