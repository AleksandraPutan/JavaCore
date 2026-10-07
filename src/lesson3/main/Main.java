package lesson3.main;
import lesson3.rainbow.Rainbow;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Приветствуем вас в приложении Радуга.\nВведите номер от 1 до 7, если хотите получить основные цвета\n" +
                "Введите цифру(от 1 до 6) + 0,5, если хотите получить смешанный цвет (при вводе дробного числа разделять цельную часть с дробной запятой(,).  ");

        double color = scanner.nextDouble();
        Rainbow rainbow = new Rainbow();
        rainbow.printColor(color);


    }

}
