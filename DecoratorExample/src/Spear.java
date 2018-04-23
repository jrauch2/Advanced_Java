public class Spear extends CharacterDecorator {

    public Spear(Character tempCharacter) {
        super(tempCharacter);
    }

    public String getName() {
        return tempCharacter.getName() + " The Spear Thrower";
    }

    public double getHealth() {
        return tempCharacter.getHealth() + 5;
    }
}
