package lesson7;

public class Horse extends Animal{
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Horse(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Horse(String food, String location, int maxSpeed) {
        super(food, location);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void makeNoise(){
        System.out.println(this.getClass().getSimpleName()+" ржёт: И-го-го!");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
