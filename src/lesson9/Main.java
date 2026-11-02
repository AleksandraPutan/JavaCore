package lesson9;

import lesson9.Body.BodyFactoryClass1;
import lesson9.Head.HeadFactoryClass1;

import java.util.Random;

import static lesson9.Robot1.count;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Robot1[] robots = new Robot1[9];
        Robot1[] robots2 = new Robot1[9];

        RobotPartFactoty1<Robot1.Head1> headFactory = new HeadFactoryClass1();
        RobotPartFactoty1<Robot1.Body1> bodyFactory = new BodyFactoryClass1();

        for (int i = 0; i < 9; i++) {
            String name = "Robot-" + (count);
            robots[i] = new Robot1(name, headFactory.makePartRobot(random.nextInt(3)), bodyFactory.makePartRobot(random.nextInt(3)));
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String name = "Robot-" + (count - 9);
                robots2[count - 9] = new Robot1(name, headFactory.makePartRobot(i), bodyFactory.makePartRobot(j));
            }
        }

        System.out.println("Вывод через рандом:");
        for (int i = 0; i < 9; i++) {
            System.out.println(robots[i]);
        }

        System.out.println("\nВывод через вложенные циклы:");
        for (int i = 0; i < 9; i++) {
            System.out.println(robots2[i]);
        }
    }

}