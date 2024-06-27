import java.util.List;
import java.util.Random;

public class Vampire extends Enemy {
    private static final int BASE_DAMAGE = 8;
    private static final double LIFESTEAL_PERCENTAGE = 0.2;
    private final Random random = new Random();

    public Vampire(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(getName() + " takes " + damage + " damage");
        setHealth(getHealth() - damage);
    }

    @Override
    public void attackEnemy(List<Hero> allHeroes) {
        int damage = BASE_DAMAGE;

        if (!allHeroes.isEmpty()) {
            Hero target = getRandomHero(allHeroes);
            target.takeDamage(damage);

            int lifeStealAmount = (int) (damage * LIFESTEAL_PERCENTAGE);
            setHealth(getHealth() + lifeStealAmount);

            System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage and heals for " + lifeStealAmount + " health.");
        }
    }

    private Hero getRandomHero(List<Hero> heroes) {
        return heroes.get(random.nextInt(heroes.size()));
    }
}
