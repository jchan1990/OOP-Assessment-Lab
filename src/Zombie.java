/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Skeleton a subclass of monster, and implement the aboutMe method.
//Example output of the aboutMe method: "I am a Zombie with 4 health and do 10 damage!"

public class Zombie extends Monster {

    public Zombie() {
    }

    public Zombie(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String aboutMe() {
        String mAboutMe = "Berrrr-Rainssss... Me Havuh " + super.getHealth() + " health. Grawh!!! " +
                "I will hit you for " + super.getDamage() + " unless you give me Berrrrains...";

        return mAboutMe;
    }
}