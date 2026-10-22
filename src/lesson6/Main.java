package lesson6;

public class Main {

    public static void main(String[] args){

        Phone phone1 = new Phone(297073202,"samsungA56",334);
        Phone phone2 = new Phone(333424636,"Iphone16",300);
        Phone phone3 = new Phone(336600375,"xiaomi",352);

        System.out.println(phone1+"\n"+phone2+"\n"+phone3);

        Person person1 = new Person("владимир",phone1);
        Person person2 = new Person("мая");

        phone1.recieveCall(person1.getName());
        phone2.recieveCall(person2.getName(), phone2.getNumber());

        phone2.sendMessage(phone1.getNumber(),phone2.getNumber(),phone3.getNumber());

    }

}
