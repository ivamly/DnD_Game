public class Berserk extends Enemy {
    public Berserk(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(this.getName() + " takes " + damage + " damage");
        this.setHealth(this.getHealth() - damage);
    }

    @Override
    public void attackEnemy(int damage, Hero hero) {
        hero.takeDamage(damage);
    }
}
