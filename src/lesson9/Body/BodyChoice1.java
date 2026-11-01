package lesson9.Body;

public enum BodyChoice1 {
    ROBOT_DOG("Робот-собака"),
    HUMANOID("Гуманоид"),
    ROBOT_ARM("Рука-робот");

    private String name;

    BodyChoice1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
