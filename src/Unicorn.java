/**
 * Created by Qube on 6/30/16.
 */
public class Unicorn extends Monster {

    public Unicorn() {
    }

    public Unicorn(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String aboutMe() {
        String mAboutMe = "You didn't see me, I'm majestic as f**k. I'm immortal so my health might show up as "
                + super.getHealth() + " to you \nI s**t rainbows out my a** it'll probably kill you on the spot " +
                "because it does like " + super.getDamage() + " to anyone not awesome like Sheldon Cooper.";

        return mAboutMe;
    }
}
