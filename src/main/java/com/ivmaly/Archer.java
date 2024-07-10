package com.ivmaly;

import java.util.List;
import java.util.Random;

public class Archer extends Hero {
    private static final int BASE_DAMAGE = 15;
    private static final double RAIN_OF_ARROWS_CHANCE = 0.4;
    private static final int RAIN_OF_ARROWS_DAMAGE = 3;
    private final Random random = new Random();

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(this.getName() + " takes " + damage + " damage");
        this.setHealth(this.getHealth() - damage);
    }

    @Override
    public void attackEnemy(List<Enemy> allEnemies) {
        if (random.nextDouble() < RAIN_OF_ARROWS_CHANCE) {
            System.out.println(getName() + " uses Rain of Arrows!");
            rainOfArrows(RAIN_OF_ARROWS_DAMAGE, allEnemies);
        } else {
            if (!allEnemies.isEmpty()) {
                Enemy target = getRandomEnemy(allEnemies);
                System.out.println(getName() + " attacks " + target.getName() + " for " + BASE_DAMAGE + " damage.");
                target.takeDamage(BASE_DAMAGE);
            }
        }
    }

    public void rainOfArrows(int damage, List<Enemy> enemies) {
        for (Enemy enemy : enemies) {
            System.out.println(getName() + " hits " + enemy.getName() + " with Rain of Arrows for " + damage + " damage.");
            enemy.takeDamage(damage);
        }
    }

    private Enemy getRandomEnemy(List<Enemy> enemies) {
        return enemies.get(random.nextInt(enemies.size()));
    }
}
