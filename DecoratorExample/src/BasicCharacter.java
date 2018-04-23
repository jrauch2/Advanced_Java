public class BasicCharacter implements Character{
    String name;
    double health;

    public BasicCharacter(String name) {
        this.name = name;
        this.health = 5;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }
}
