package RPG;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;




public class Enemy extends Character{
		
private  int enemyCoin = 5;
	private int damage = 0;


	public Enemy(String name,int index, int attack, int HP, int coin) {
		super(name ,attack, HP, coin);
		
	}

//Enemy Attack
	public void attackE(Player player) {
		damage = getAttack();
		int newHP = player.getHP()-damage;
		player.setHP(newHP);
		
	}


	
	
}//end of class