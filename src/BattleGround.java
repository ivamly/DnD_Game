import java.util.ArrayList;
import java.util.List;

public class BattleGround {
    public static void main(String[] args) {

        int heroesWin = 0;
        int enemiesWin = 0;

        for (int i = 0; i < 100; i++) {

            List<Hero> heroes = createHeroes();

            List<Enemy> enemies = createEnemies();

            while (anyAlive(heroes) && anyAlive(enemies)) {
                for (Hero hero : heroes) {
                    if (anyAlive(enemies)) {
                        hero.attackEnemy(enemies);
                    } else {
                        break;
                    }
                }

                for (Enemy enemy : enemies) {
                    if (anyAlive(heroes)) {
                        enemy.attackEnemy(heroes);
                    } else {
                        break;
                    }
                }
            }

            if (anyAlive(heroes)) {
                System.out.println("Heroes win!");
                heroesWin++;
            } else {
                System.out.println("Enemies win!");
                enemiesWin++;
            }
        }
        System.out.println("Heroes win: " + heroesWin);
        System.out.println("Enemies win: " + enemiesWin);
    }

    private static List<Hero> createHeroes() {
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Warrior("Warrior", 100));
        heroes.add(new Mage("Mage", 80));
        heroes.add(new Archer("Archer", 90));
        return heroes;
    }

    private static List<Enemy> createEnemies() {
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new Goblin("Goblin1", 50));
        enemies.add(new Goblin("Goblin2", 50));
        enemies.add(new Zombie("Zombie", 70));
        enemies.add(new Vampire("Vampire", 60));
        return enemies;
    }

    private static boolean anyAlive(List<? extends Mortal> entities) {
        for (Mortal entity : entities) {
            if (entity.isAlive()) {
                return true;
            }
        }
        return false;
    }
}
