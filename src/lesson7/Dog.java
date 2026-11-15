package lesson7;

public class Dog extends Animal{

    public String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(){}

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise(){
        System.out.println(this.getClass().getSimpleName()+" лает: Гав-гав!");
    }

    @Override
    public void eat(){
        System.out.println(this.getClass().getSimpleName()+" ест "+getFood());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
