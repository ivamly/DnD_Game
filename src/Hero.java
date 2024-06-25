public abstract class Hero implements Motral {
    private final String name;
    private int health;

    public Hero(String name, int health) {
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
    }

    public abstract void takeDamage(int damage);

    public abstract void attackEnemy(int damage, Enemy enemy);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
