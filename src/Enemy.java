import java.util.List;

public abstract class Enemy implements Mortal {
    private final String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (!isAlive()) {
            System.out.println(name + " is dead!");
        }
    }

    public abstract void takeDamage(int damage);

    public abstract void attackEnemy(List<Hero> allHeroes);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
