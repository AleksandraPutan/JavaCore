package lesson8;

import lesson8.Body.BodyFactory;
import lesson8.Body.BodyFactoryClass;
import lesson8.Head.HeadFactory;
import lesson8.Head.HeadFactoryClass;

import java.util.Random;

import static lesson8.Robot.count;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Robot[] robots = new Robot[9];
        Robot[] robots2 = new Robot[9];

        HeadFactory headFactory = new HeadFactoryClass();
        BodyFactory bodyFactory = new BodyFactoryClass();

        for (int i = 0; i < 9; i++) {
            String name = "Robot-" + (count);
            robots[i] = new Robot(name, headFactory.makeHead(random.nextInt(3)), bodyFactory.makeBody(random.nextInt(3)));
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String name = "Robot-" + (count - 9);
                robots2[count - 9] = new Robot(name, headFactory.makeHead(i), bodyFactory.makeBody(j));
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