package cpsc233;

public class Enemy {
	String name;
	int health;
	int attack;
	
	public Enemy(String name, int health, int attack) {
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	
	public static Enemy getRandomEnemy() {
		int n = (int) (Math.random() * 3 + 1);
		if (n == 1) {
			return new Enemy("Math Test", 50, 4);
		} else if (n == 2) {
			return new Enemy("CPSC Test", 45, 5);
		} else if (n == 3) {
			return new Enemy("Science Test", 65, 2);
		} else {
			return new Enemy("Neverpick", 999,999);
		}
	}
	
	public void enemyAttack(Character player) {
		player.health = player.health - this.attack;
		System.out.println("The test attacks your sanity for " + this.attack + " damage!");
		System.out.println("You have " + player.health + " sanity left.");
	}
	
}