package lesson9.Head;

public enum HeadChoice1 {
    IRON("Железная"),
    BRONZE("Бронзовая"),
    GOLD("Золотая");

    private String name;

    HeadChoice1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
