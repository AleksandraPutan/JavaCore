package lesson4.cat;

import java.util.Objects;

public class Cat {
    public static int count = 0;
    public static final String DEFAULT_NAME="Муся";
    public static final int DEFAULT_AGE= 10;

    private String name = DEFAULT_NAME;
    private int age = DEFAULT_AGE;
    private int id = count;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && id == cat.id && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id="+ id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
