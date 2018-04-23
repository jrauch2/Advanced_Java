public class Shield extends CharacterDecorator{
    public Shield(Character tempCharacter) {
        super(tempCharacter);
    }

    public String getName() {
        return tempCharacter.getName() + " The Shield Bearer";
    }

    public double getHealth() {
        return tempCharacter.getHealth() + 20;
    }
}
