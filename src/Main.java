/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)
        Monster[] monsters = new Monster[3];
        monsters[0] = new Dragon(1337, 100);
        monsters[1] = new Zombie(100, 2);
        monsters[2]= new Unicorn (0, 1337);

        //TODO: Loop through the array of Monsters, printing out something for each Monster
        for (Monster m : monsters) {
            System.out.println(m.aboutMe());
            System.out.println();
        }
    }
}
