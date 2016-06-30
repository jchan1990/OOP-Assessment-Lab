/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables

    private int mHealth, mDamage;

    public Monster() {
    }

    public Monster(int health, int damage) {
        mHealth = health;
        mDamage = damage;
    }

    public int getHealth() {
        return mHealth;
    }

    public int getDamage() {
        return mDamage;
    }

    public void setHealth(int health) {
        mHealth = health;
    }

    public void setDamage(int damage) {
        mDamage = damage;
    }

    public abstract String aboutMe();
}
