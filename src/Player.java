public class Player {
    private String name;
    private int health;
    private Weapon weapon;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.weapon = new Weapon("Первый", 5);
    }

    public void equip(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        System.out.println(name + " атакует " + enemy.getName() + " с" + weapon.getName() + ".");
        enemy.takeDamage(weapon.getDamage());
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " получает " + damage + " урон. Остаток здоровья " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }
}

class Enemy {
    private String name;
    private int health;
    private Weapon weapon;

    public Enemy(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void attack(Player player) {
        System.out.println(name + " атакует " + player.getName() + " с " + weapon.getName() + ".");
        player.takeDamage(weapon.getDamage());
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " получет " + damage + " урон. Остаток здоровья " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }
}

class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
