package com.ivmaly;

import java.util.List;
import java.util.Random;

public class Goblin extends Enemy {
    private static final int BASE_DAMAGE = 20;
    private static final double CRITICAL_HIT_CHANCE = 0.1;
    private final Random random = new Random();

    public Goblin(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(this.getName() + " takes " + damage + " damage");
        this.setHealth(this.getHealth() - damage);
    }

    @Override
    public void attackEnemy(List<Hero> allHeroes) {
        int damage = BASE_DAMAGE;
        if (random.nextDouble() < CRITICAL_HIT_CHANCE) {
            damage *= 3;
            System.out.println(getName() + " performs a critical hit!");
        }
        if (!allHeroes.isEmpty()) {
            Hero target = getRandomHero(allHeroes);
            System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage.");
            target.takeDamage(damage);
        }
    }

    private Hero getRandomHero(List<Hero> heroes) {
        return heroes.get(random.nextInt(heroes.size()));
    }
}
