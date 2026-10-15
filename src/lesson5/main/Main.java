package lesson5.main;

import java.util.Objects;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static Random random = new Random();
    static int counter = 0;

    public static String randomString() {

        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < 7; i++) {

            int charElement = random.nextInt(1040, 1104);
            strBuilder.append((char) charElement);

        }

        return strBuilder.toString();

    }

    public static double randomDouble() {

        StringBuilder strBuilder = new StringBuilder();

        int firstElement = random.nextInt(0, 10);
        strBuilder.append(firstElement);
        strBuilder.append(".");

        for (int i = 0; i < 5; i++) {

            int othersElements = random.nextInt(0, 10);
            strBuilder.append(othersElements);

        }

        double doubleElement = Double.parseDouble(String.valueOf(strBuilder));

        return doubleElement;
    }

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("лабуба");
        stringBuilder.append("dfg");

        Pattern pattern = Pattern.compile("^[A-Za-z]{7}$");
        Matcher matcher = pattern.matcher(stringBuilder);

        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }

        Object[][] objects = new Object[10][10]; //Так как все классы в Java наследуются от Object и в этом массиве можно хранить как String, так и double.

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                int choice = random.nextInt(1, 3);

                if ((choice == 1) || (((counter + 1) % 3) == 0)) {
                    objects[i][j] = randomDouble();
                    counter++;

                } else if (choice == 2) {
                    objects[i][j] = randomString();
                    counter++;
                } else System.out.println("Ошибка");

            }

        }

        for (int i = 0; i < 10; i++) {
            boolean choice = objects[i][i].equals(objects[i][9 - i]);

            if (!choice) {
                System.out.println("Диагонали различаются");
                break;
            } else {
                System.out.println("Диагонали совпадают");
            }


        }

        Object[] objectsNew = new Object[20];

        for (int i = 0; i < 10; i++) {
            objectsNew[i] = objects[i][i];
        }

        for (int i = 10; i < 20; i++) {
            objectsNew[i] = objects[i - 10][9 - (i - 10)];
        }


        System.out.println("\nВывод массива элементов главной диагонали + побочной:");
        for (int i = 0; i < 20; i++) {

            System.out.printf(objectsNew[i].toString() + " ");


        }

        StringBuilder strResults = new StringBuilder();
        int[] doubleResults = new int[20];
        int doubleCounter = 0;
        for (int i = 0; i < 20; i++) {

            if (objectsNew[i] instanceof String) {

                String strRes = String.valueOf(objectsNew[i]);
                strResults.append(strRes.substring(1, 4) + ", ");

            } else if (objectsNew[i] instanceof Double) {


                double residue = (double) objectsNew[i] % 1;
                double result = (double) objectsNew[i] - (double) objectsNew[i] % 1;

                if (residue >= 0.7) {
                    int result1 = (int) result + 1;
                    doubleResults[doubleCounter] = result1;
                    doubleCounter++;
                } else if (residue < 0.7) {
                    int result1 = (int) result;
                    doubleResults[doubleCounter] = result1;
                    doubleCounter++;
                }

            }

        }

        System.out.println("\n\nВывод массива округлённых чисел:");

        int[] doubleResult2 = new int[doubleCounter];
        for (int i = 0; i < doubleCounter; i++) {
            doubleResult2[i] = doubleResults[i];
            System.out.printf(doubleResult2[i] + "_");

        }

        System.out.println("\n\nВывод получившихся substring через запятую:\n" + strResults);

        for (int i = 0; i < 10; i++) {

            System.out.printf("\n" + i + ". ");

            for (int j = 0; j < 10; j++) {

                String value = String.valueOf(objects[i][j]);

                System.out.printf(String.format("%-10s", value));

            }

        }

    }
}
