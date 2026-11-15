package lesson11.model;

import lesson11.exception.InvalidAgeException;
import lesson11.exception.NullNameException;

public class Person {

    String name;
    int age;

    public Person() {
    }

    public void validName(String name) throws NullNameException {
        if (name != null) {
            System.out.println("Имя введено");
        } else throw new NullNameException();
    }

    public void validAge(int age) throws InvalidAgeException {
        if (age >= 0 && age <= 125) {
            System.out.println("Возраст валиден.");
        } else throw new InvalidAgeException(age);
    }

    public void validData(String name,int age) throws NullNameException, InvalidAgeException{
        validName(name);
        validAge(age);
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
}
