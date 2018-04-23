public class Main {
    public static void main(String[] args) {
        Character basicCharacter = new Spear(new Sword(new Shield( new Starving(new BasicCharacter("Bilbo")))));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Health: " + basicCharacter.getHealth());
    }
}
