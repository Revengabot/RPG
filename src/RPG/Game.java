package RPG;
import extra.ConsoleColors;
import masdododod.Main;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Game {
	//player declaration as global variable
	public static Player player = new Player("playerName");
  // indexEnemy
  private static int enemyNameIndex = 0;
  private static int enemyHealth = 75;
  private static int enemyAttack = 20;
  //scanner
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
	  
		//ensure Store arraylist of products are functional
		Store.main(args);

		
		
		

    // take player name input and introduce player to game
    System.out.println(ConsoleColors.CYAN_BOLD +"Welcome to this RPG!" + ConsoleColors.RESET);
    System.out.println("What is your name?");
    String playerName = scanner.nextLine();
    //set player name
    player.setName(playerName);
    
    //welcome player
    System.out.println("Welcome " + ConsoleColors.YELLOW_BOLD + player.getName() + ConsoleColors.RESET+"!");
    
    //Ask user what class they want to choose
    //(Each avatar has a different set of starting stats)
    System.out.println("What avatar do you want?" + ConsoleColors.BLUE_BOLD + "\n\tSludge" + ConsoleColors.RESET + "(More attack but low HP)\n\t"
    + ConsoleColors.GREEN_BOLD +"Mushroom"+ConsoleColors.RESET +  " (Balanced HP and attack)"
    + ConsoleColors.MAGENTA +"\n\tGhost"+ ConsoleColors.RESET
    + "(More HP but lower attack)" + "\n\tGoomba" + "(Higher HP and slighlty higher Attack)");
 
  //--Proccesssing user's avatar input--//

  //user chooses Sludge
    String classChoice = scanner.nextLine();
  if(classChoice.equalsIgnoreCase("Sludge")) {
	  player.setAttack(100);
	  player.setHP(100);
	  Main.slime();
	  


    //user chooses Ghost
  }else if(classChoice.equalsIgnoreCase("Ghost")){
	  player.setAttack(50);
	  player.setHP(200);
	  Main.ghost();
	  

	  
    //user chooss Mushroom
  }else if(classChoice.equalsIgnoreCase("Mushroom")){
	  player.setAttack(31);
	  player.setHP(450);
	  Main.mushroom();
	  
	  

	  
  }
  //user chooses Goomba
  else if(classChoice.equalsIgnoreCase("Goomba")){
	  player.setAttack(80);
	  player.setHP(500);
	  Main.goomba();

	  
  }
  //Playe
  else {
	  System.out.println("NOT A VALID CHOICE");
  }//end of user class choice proccesing 


    // create a new encounter loop for all enemies in arraylist
    while (player.getHP()>0&&enemyNameIndex<26) {//i tool out an = here
      
      // create new encounter
    	
      Enemy enemy = new Enemy(enemyGenName(), 0, 0, 0, 0);
      Encounter encounter = new Encounter(player, enemy);
      
      enemyNameIndex++;
      enemyAttack= (int)(enemyAttack + (Math.random()*13));
      enemyHealth = (int)(enemyHealth + (Math.random()*50));
      // increase enemy index every time new encounter generated
      
      //level up player
      if (enemyNameIndex %3 == 0&&!(enemyNameIndex==0)) {
        player.setAttack((int)(player.getAttack()+(Math.random()*15)));
        player.setHP((int)(player.getHP()+(Math.random()*250)));
        System.out.println(ConsoleColors.GREEN_BOLD + "\nLevel Up!\nYou now have "+ player.getHP() +" HP and " + player.getAttack() +" attack\n" + ConsoleColors.RESET);
      }
      
     // enemy.ememy  
      enemy.setCoin((int)(Math.random()*10));
      enemy.setHP(enemyHealth);
      enemy.setAttack(enemyAttack);
      
      while (enemy.getHP()>0) {

        // keep printing out options if enemy is alive
        if (enemy.getHP()>0&&player.getHP()>0) {
        	 System.out.println(enemy.getName() + " has " + enemy.getCoin() + " coins");
             System.out.println("You Encounter an " + enemy.getName() + "! What will you do?");
          System.out.println("What will you do?\n\ta-Attack\n\td-Defend");
          String choice = scanner.nextLine();
          if (choice.equals("a")) {
            encounter.attack();

          } else if (choice.equals("d")) {
            encounter.defend();
          } else {
            System.out.println(ConsoleColors.RED_BACKGROUND+"THATS NOT A VALID CHOICE" + ConsoleColors.RESET);
          }

//        } else if (player.getHP() <= 0) {
//         System.out.println("YOU DIED!");
//          break;
//        }
       
      }else {
    	  break;
      }//end of ese for breaking while loop
    }//end of player attack an defend choices
      } // end of while
      
    if(player.getHP()<=0) {
  	  System.out.println("You DIED");
  	  System.out.println("Highscore is " + player.getCoin() +" coins!");
    }else {
  	  System.out.println("YOU BEAT THE GAME! BAD JOB!");
  	  System.out.println("Highscore is " + player.getCoin() +" coins!");
    }
    
    scanner.close();
  }// end of main method


  //Load in Enemy names from text file
  private static ArrayList<String> name;

  private static String enemyGenName() {
    name = loadStringList("enemyName.txt");
    return name.get(enemyNameIndex);
  }

  private static ArrayList<String> loadStringList(String filename) {
    ArrayList<String> temp = new ArrayList<String>();
    try {
      BufferedReader file = new BufferedReader(new FileReader(filename));
      while (file.ready()) {
        temp.add(file.readLine());
      } // end while
      file.close();
    } catch (IOException e) {
      System.out.println(e);
    }

    return temp;
  }

}//end of class
//make global variable of index, reference that index in a variable, be awesome
//https://www.w3docs.com/snippets/java/accessing-a-variable-from-another-class.html
// increase enemy health by 50 every time
     // enemyHealth = enemyHealth + 50;
      // increase enemy attack by 10 evey time
     // enemyAttack = enemyAttack + 10;
      // testing if coinCount holds proper value

      //increase player's coins for every enemy 
      //player.setCoin(enemy.getCoin());
      
