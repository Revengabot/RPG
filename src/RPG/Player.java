package RPG;

/*
 * Name: Sarah
 * We modularized this object because there are multiple attributes
 * that we need to change throughout the game
 * like health and attack, we also did this because there are multiple 
 * that will only work if the player is a separate class (which makes
 * the code more efficient and tidy)modularizing this will also help us 
 * implement more features in the future like saving and loading
 * 
 * We have these attributes in this class because it is all used during gameplay
 * We decided to have a base attack and HP that can be changed anytime through
 * the leveling up system or changing classes, we also used inheritance methods from 
 * the super class "character" to change those attributes
 * Attributes like name is only set once and cant be changed during the game
 * which is why there is no method for changing it.
 */

public class Player extends Character {
	private  int playerCoin=0;
	private  Double damage = 0.0;
	
	
	

	public Player(String name) {
		super(name, 50, 200, 0);
	}
	 
 	
	

	


	//Player attack code and setting new HP for Enemy
	public void attack(Enemy enemy) {
		damage = (double) getAttack();
		int newHP = (int) (enemy.getHP()-damage);
		enemy.setHP(newHP);
		
	}







	







	
	

	
	
}
