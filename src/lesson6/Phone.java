package lesson6;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Phone(int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){};

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void recieveCall(String name){
        System.out.println("Звонит {"+name+"}");
    }

    public void recieveCall(String name,int number){
        System.out.println("Звонит {"+name+"}, номер{"+number+"}");
    }

    public void sendMessage(Integer ... numbers){

        for (int number : numbers){
            System.out.println("Сообщение отправлено номеру: "+ number);
        }

    }
}
