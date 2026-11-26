package lesson13;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Runnable runnable = () -> System.out.println("Привет из лямбды!");
        Runnable runnable2 = () -> System.out.println("Вторая лямбда работает!");
        runnable.run();
        runnable2.run();
    }
}
