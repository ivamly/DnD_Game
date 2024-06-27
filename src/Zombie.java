import java.util.List;
import java.util.Random;

public class Zombie extends Enemy {
    private static final int BASE_DAMAGE = 5;
    private static final double REVIVE_CHANCE = 0.8;

    private boolean hasRevived;
    private final int initialHealth;
    private final Random random = new Random();

    public Zombie(String name, int health) {
        super(name, health);
        this.initialHealth = health;
        this.hasRevived = false;
    }

    @Override
    public void takeDamage(int damage) {
        int newHealth = getHealth() - damage;
        setHealth(newHealth);

        if (newHealth <= 0 && !hasRevived) {
            revive();
        } else if (newHealth <= 0) {
            System.out.println(getName() + " takes " + damage + " damage and is dead.");
        } else {
            System.out.println(getName() + " takes " + damage + " damage.");
        }
    }

    private void revive() {
        if (random.nextDouble() < REVIVE_CHANCE) {
            this.hasRevived = true;
            int revivedHealth = initialHealth / 2;
            setHealth(revivedHealth);
            System.out.println(getName() + " has revived with " + revivedHealth + " health!");
        }
    }

    @Override
    public void attackEnemy(List<Hero> allHeroes) {
        if (!allHeroes.isEmpty()) {
            Hero target = getRandomHero(allHeroes);
            int damage = BASE_DAMAGE;
            target.takeDamage(damage);
            System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage.");
        }
    }

    private Hero getRandomHero(List<Hero> heroes) {
        return heroes.get(random.nextInt(heroes.size()));
    }
}
