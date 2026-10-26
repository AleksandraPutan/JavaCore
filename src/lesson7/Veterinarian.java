package lesson7;

public class Veterinarian {

    public void treatAnimal(Animal animal){
        System.out.println("На приёме: food="+ animal.getFood()+", location ="+ animal.getLocation());
    }

    public void examine(Animal animal){
        if(animal instanceof Cat){
            System.out.println("Кот домашний: "+ ((Cat) animal).isIndoor());
        }
        else if (animal instanceof Dog){
            System.out.println("Собака породы: "+ ((Dog) animal).getBreed());
        }
        else if(animal instanceof Horse){
            System.out.println("Максимальная скорость лошади: "+((Horse) animal).getMaxSpeed());
        }
        else System.out.println("Нет информации об этом виде");

    }
}
