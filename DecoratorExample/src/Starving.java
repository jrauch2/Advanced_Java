public class Starving extends CharacterDecorator{
    public Starving(Character tempCharacter) {
        super(tempCharacter);
    }

    public String getName() {
        return tempCharacter.getName() + " The Growling";
    }

    public double getHealth() {
        return tempCharacter.getHealth() - 10;
    }
}
