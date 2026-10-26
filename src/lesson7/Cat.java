package lesson7;

public class Cat extends Animal{

    private boolean isIndoor;

    public Cat(boolean isIndoor) {
        this.isIndoor = isIndoor;
    }

    public Cat(String food, String location, boolean isIndoor) {
        super(food, location);
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeNoise(){
        System.out.println(this.getClass().getSimpleName()+" мяукает: Мяу!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isIndoor=" + isIndoor +
                '}';
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }
}
