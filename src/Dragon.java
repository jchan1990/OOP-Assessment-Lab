/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster {

    public Dragon() {
    }

    public Dragon(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String aboutMe() {
        String mAboutMe = "I will burn you unless you replenish me back to full health, I have " + super.getHealth()
                + " health. \n*Breathe Fire and Intimidate* " + " I will hit you for " + super.getDamage()
                + " unless you give me what I want *Breathe More Fire.";

        return mAboutMe;
    }
}
