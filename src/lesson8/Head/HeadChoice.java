package lesson8.Head;

public enum HeadChoice {
    IRON("Железная"),
    BRONZE("Бронзовая"),
    GOLD("Золотая");

    private String name;

    HeadChoice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
