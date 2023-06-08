package RPG;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {ew ArrayList<Product>();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

//Create Products
// these are the parameters - setProduct(String name , int health , int attackBoost , int price )
		storeInventory.add(new Product("Sword", 32, 70, 200));
		storeInventory.add(new Product("Tolu", 115, 25, 10230);
storeInventory.add(new Product("Sarah(Orb)", 30, 255, 230));
storeInventory.add(new Product("Manaal", 2, 39, 5));
storeInventory.add(new Product("Poopy from the Movie: Trolls" , 0, 370, 200));		storeRun();

	}

//verify is they have enough money for it
//if true , return variables of the product eg health , attackboost so that the value in the game can be updated  

public static void storeRun() {
    for (int i = 0; i< storeInventory.size(); i++ ) { //tolu's personal note, print out in tabular form 
        System.out.println("Name:" + storeInventory.get(i).getName() + " " + storeInventory.get(i).getHealth() + " " +
         storeInventory.get(i).getAttackBoost() + " " +  storeInventory.get(i).getPrice());  

    }

    // request for a product

    System.out.println("What item do you want?\nPlease input item name");
// request for a product

System.out.println()if ()    
}

}
// end of class
