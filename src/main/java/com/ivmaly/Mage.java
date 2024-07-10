package com.ivmaly;

import java.util.List;
import java.util.Random;

public class Mage extends Hero {
    private static final int BASE_DAMAGE = 10;
    private static final double FIREBALL_CHANCE = 0.3;
    private static final int FIREBALL_DAMAGE = 15;
    private final Random random = new Random();

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(this.getName() + " takes " + damage + " damage");
        this.setHealth(this.getHealth() - damage);
    }

    @Override
    public void attackEnemy(List<Enemy> allEnemies) {
        if (random.nextDouble() < FIREBALL_CHANCE) {
            System.out.println(getName() + " creates a fireball!");
            createFireball(FIREBALL_DAMAGE, allEnemies);
        } else {
            if (!allEnemies.isEmpty()) {
                Enemy target = getRandomEnemy(allEnemies);
                System.out.println(getName() + " attacks " + target.getName() + " for " + BASE_DAMAGE + " damage.");
                target.takeDamage(BASE_DAMAGE);
            }
        }
    }

    public void createFireball(int damage, List<Enemy> enemies) {
        for (Enemy enemy : enemies) {
            System.out.println(getName() + " hits " + enemy.getName() + " with a fireball for " + damage + " damage!");
            enemy.takeDamage(damage);
        }
    }

    private Enemy getRandomEnemy(List<Enemy> enemies) {
        return enemies.get(random.nextInt(enemies.size()));
    }
}
