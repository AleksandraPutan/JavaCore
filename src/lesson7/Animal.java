package lesson7;

import java.util.Objects;

public class Animal {

    private String food;
    private String location;

    public void makeNoise(){

        System.out.println(this.getClass().getSimpleName()+" издаёт звук");

    }

    public void eat(){
        System.out.println(this.getClass().getSimpleName()+" ест "+ food);
    }

    public void sleep(){
        System.out.println(this.getClass().getSimpleName()+" спит");
    }
    public Animal(){}

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(food, animal.food) && Objects.equals(location, animal.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
