package lesson7;

public class Main {

    static int countCat = 0;
    static int countDog = 0;
    static int countHorse = 0;

    static Veterinarian vet = new Veterinarian();

    public static void main(String[] args) {
        System.out.println("Имя клиники"+Veterinarian.CLINIC_NAME);

        Animal [] animals = {new Dog("Корм","Дом","Кавалер спаниель"),new Dog("Косточки","Будка","Дворняжка"),
                new Cat("Молоко","Улица",true), new Cat(false), new Horse("Морковка","Конюшня",220),
                new Horse(200)};

        for(int i = 0;i<animals.length;i++){
            System.out.println("Животное №"+(i+1));
            animals[i].makeNoise();
            animals[i].eat();
            animals[i].sleep();
            animals[i].eat();
            vet.treatAnimal(animals[i]);
            vet.examine(animals[i]);
            System.out.println(animals[i]+"\n");
            if(animals[i] instanceof Cat){
                countCat++;
            }
            else if (animals[i] instanceof Dog){
                countDog++;
            }
            else if(animals[i] instanceof Horse){
                countHorse++;
            }
        }

        System.out.println("Итог:\nСобак: "+countDog+"\nКошек: "+countCat+"\nЛошадей: "+countHorse);
        System.out.println("Итого всего животных с помощью статического счётчика: "+Animal.getCounter());
    }



}