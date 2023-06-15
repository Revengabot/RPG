package RPG;

public class Encounter {
	
	private Player player;
	private Enemy enemy;
	private boolean active;
  private int defendRoll = 0;
  

	
	public Encounter(Player player, Enemy enemy) {
		
		this.player = player;
		this.enemy = enemy;
		this.active = true;
		
		}
	
	public String getPlayerName() {
		return this.player.getName();
	
	}
	
	public String getEnemyName() {
		return this.enemy.getName();
	}
	
	public boolean isActive() {
		return this.active;
	}


  //---BASIC FUNCTION --> ATTACK AND DEFENSE ---//
  //Attack sequences
  public void attack() {
	  
	//-------player attack------//
  player.attack(enemy); 
  //Printing output of player attacks
  System.out.println("\n" + player.getName() + " attacks " + enemy.getName());
  System.out.println("\t" + enemy.getName() + " is at " + enemy.getHP() + " HP");
	System.out.println("\t" + player.getName() + " did " + player.getAttack() + " amount of damage!");
  //------enemy attack------//
	enemy.attackE(player);
	//printing enemy attack output
	System.out.println("\n" + enemy.getName() + " attacks " + player.getName());
	System.out.println("\t" + enemy.getName() + " did " + enemy.getAttack() + " amount of damage!");
	System.out.println("\t" + player.getName() + " is at " + player.getHP() + " HP");
	//enemy dead-->then what?
    if (enemy.getHP() <= 0) {
      //print out enemy player defeated
        System.out.println("\n\t" +  enemy.getName() + " is dead! Good job, Goofy " + player.getName());
      //set up coins to allow player to gain enemy's coins
    	player.setCoin( enemy.getCoin() + player.getCoin());
      System.out.println(player.getName()+ " has " + player.getCoin() + " coins");
      enemy.setCoin(enemy.getCoin());
	  
		Store.storeRun();
		


       

		} else {
            
            if (player.getHP()<=0) {
               System.out.println("YOU DIED!");
               System.out.println("\nGAME OVER!");
               //active = false;
            }//end of if
    
    
        }//end of if/else
  }//end of attack 

  public void defend() {
        System.out.println("\n" + player.getName() + " defends");
        System.out.println(enemy.getName() + " attacks " + player.getName());
        defendRoll=randomNum(10);
        int playHP;
		if (defendRoll<=2) {
			System.out.println("The enemy still hits you!");
        	   playHP = (player.getHP()-enemy.getAttack());
		player.setHP(playHP);

        } else if (defendRoll >= 8) {
            System.out.println("\t\n" + "You successfully Defended!\n");  
    }else {
    	System.out.println("You succesfully defended and managed to also heal yourself! You now have "+player.getHP() +" HP");
    	playHP = (int)(player.getHP()+(Math.random()*100));
    	player.setHP(playHP);
    }
   }
    
	
//dice roll
private int randomNum(double a) {
		a = Math.random()*10;
		return (int) (a);

	}
	
}