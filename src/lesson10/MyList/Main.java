package lesson10.MyList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyList<String> myList = new MyArrayList();

        System.out.println("Размер массива: " + myList.size());
        System.out.println("Массив пустой ли: " + myList.isEmpty());

        myList.add("Пример 0");
        myList.add("Пример 1");
        myList.add("Пример 2");
        myList.add("Пример 3");
        myList.add("Пример 4");
        myList.add("Пример 5");

        System.out.println("\nВывод myList: ");
        myList.view();

        System.out.println("\nРазмер массива: " + myList.size());
        System.out.println("Массив пустой ли: " + myList.isEmpty());

        myList.add(3, "Пример вставленный через индекс");


        System.out.println("\nВывод myList: ");
        myList.view();

        System.out.println("\nСодержит ли myList Пример 3: " + myList.contains("Пример 3"));
        myList.remove("Пример 3");
        System.out.println("После удаления: \nСодержит ли myList Пример 3: " + myList.contains("Пример 3"));

        System.out.println("\nmyList после удаления Примера 3");
        myList.view();

        MyArrayList<String> myArrayList = new MyArrayList(myList);
        System.out.println("\nПолученный элемент под индексом 2: " + myArrayList.get(2));
        System.out.println("Вставленный элемент вместо 2: " + myArrayList.set(2, "Второй"));
        System.out.println("\nВывод myArrayList: ");
        myArrayList.view();

        System.out.println("\nУдалённый элемент: " + myArrayList.remove(2));
        System.out.println("\nКонечный результат myArrayList:");
        myArrayList.view();

        System.out.println("\nНайден ли Пример 3: "+myArrayList.indexOf("Пример 3"));
        System.out.println("Найден ли Пример 4: "+myArrayList.indexOf("Пример 4"));

        List<String> list = new ArrayList();
        list.add("Пример из List");
        MyArrayList<String> myArrayList1 = new MyArrayList<>(5);
        myArrayList1.add("Пример myArrayList 0");
        myArrayList1.addAll(list);
        System.out.println("\nВывод myArrayList1 созданный с помощью addAll()");
        myArrayList1.view();

    }
}
