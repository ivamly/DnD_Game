package com.ivmaly;

import java.util.List;
import java.util.Random;

public class Warrior extends Hero {
    private static final int BASE_DAMAGE = 20;
    private static final double DOUBLE_ATTACK_CHANCE = 0.2;
    private final Random random = new Random();

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(this.getName() + " takes " + damage + " damage");
        this.setHealth(this.getHealth() - damage);
    }

    @Override
    public void attackEnemy(List<Enemy> allEnemies) {
        int damage = BASE_DAMAGE;

        if (random.nextDouble() < DOUBLE_ATTACK_CHANCE) {
            System.out.println(getName() + " performs a double attack!");
            if (!allEnemies.isEmpty()) {
                Enemy target1 = getRandomEnemy(allEnemies);
                Enemy target2 = getRandomEnemy(allEnemies);
                System.out.println(getName() + " attacks " + target1.getName() + " for " + damage + " damage.");
                target1.takeDamage(damage);
                System.out.println(getName() + " attacks " + target2.getName() + " for " + damage + " damage.");
                target2.takeDamage(damage);
            }
        } else {
            if (!allEnemies.isEmpty()) {
                Enemy target = getRandomEnemy(allEnemies);
                System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage.");
                target.takeDamage(damage);
            }
        }
    }

    private Enemy getRandomEnemy(List<Enemy> enemies) {
        return enemies.get(random.nextInt(enemies.size()));
    }
}
