package lesson4.main;

import lesson4.cat.Cat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static String randomString() {
        char[] arrayRandom = new char[7];
        Random r = new Random();
        for (int i = 0; i < arrayRandom.length; i++) {
            int randChar = r.nextInt(1040, 1103);
            arrayRandom[i] = (char) randChar;

        }
        String nameCat = String.valueOf(arrayRandom);
        return nameCat;
    }

    public static String randomCatName(){
        Random random = new Random();

        String[] nameCatsArray= {"Муся","Барсик","Кутя","Жужа","Мотя","Клёпа",
                "Рыжик","Масяня","Пятнышко","Дружок","Кот"};

        int rand = random.nextInt(nameCatsArray.length);
        return nameCatsArray[rand];

    }

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Вывод цикла while");
        int i = 0;
        while (i < 10) {
            Cat cat = new Cat();
            Cat.count++;
            System.out.println(cat);
            i++;
        }

        System.out.println("Вывод цикла for");
        for (int j = 0; j < 10; j++) {

            Cat cat = new Cat();
            Cat.count++;
            cat.setAge(random.nextInt(29));
            cat.setName(randomString());
            System.out.println(cat);

        }

        System.out.println("Вывод цикла do-while");
        do {
            Cat cat = new Cat(randomCatName(), random.nextInt(29));
            Cat.count++;
            System.out.println(cat);
            i--;
        }
        while(i>0);

        Cat[] cats = new Cat[5];

        for(int j =0; j<5; j++){
            Cat cat = new Cat(randomCatName(), random.nextInt(29));
            Cat.count++;
            cats[j] = cat;

        }

        System.out.println("Вывод через foreach");
        for(Cat cat: cats){
            System.out.println(cat);
       }
        Cat oldest = Arrays.stream(cats).max(Comparator.comparingInt(Cat::getAge)).orElseThrow();

        System.out.println("Самый старший кот из цикла foreach: "+ oldest+"; Его возраст "+ oldest.getAge()+"!");
        System.out.println("Финальное количество котов: "+ Cat.count);

    }


}
