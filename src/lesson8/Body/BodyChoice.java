package lesson8.Body;

public enum BodyChoice {
    ROBOT_DOG("Робот-собака"),
    HUMANOID("Гуманоид"),
    ROBOT_ARM("Рука-робот");

    private String name;

    BodyChoice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
