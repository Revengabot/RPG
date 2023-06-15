package RPG;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Product> storeInventory = new ArrayList<Product>();
    public static boolean sheshon = true;
public static void main(String[] args) {

//Create Products
// these are the parameters - setProduct(String name , int health , int attackBoost , int price )
storeInventory.add(new Product("Elaine(Sword)", 32, 70, 200));
storeInventory.add(new Product("Manaal", 2, 39, 5));
storeInventory.add(new Product("Poopy from the Movie: Trolls" , 0, 370, 200));		
storeInventory.add(new Product("Sarah(Orb)", 30, 255, 230));
storeInventory.add(new Product("Tolu", 115, 25, 10230));


//storeRun();
    }

//verify is they have enough money for it
//if true , return variables of the product eg health , attackboost so that the value in the game can be updated  

public static void storeRun() {
   
   
    while (sheshon) {

    for (int i = 0; i< storeInventory.size(); i++ ) { //tolu's personal note, print out in tabular form 
        System.out.println("Name:" + storeInventory.get(i).getName() + " " + storeInventory.get(i).getHealth() + " " +
         storeInventory.get(i).getAttackBoost() + " " + storeInventory.get(i).getPrice());  

    }
    // request for a product
    
    
    System.out.println("What item do you want?\nPlease input item name");
    String requestedProduct = scan.nextLine();
   int searchProductResult = Search.binarySearchString(storeInventory,requestedProduct);

    if (searchProductResult == -1) {
        System.out.println("Product not found!, try again.");
        sheshon = false;
        
    } 
    else {
        
        if (storeInventory.get(searchProductResult).getPrice() >= Game.player.getCoin()) {
            System.out.println("Are you sure you want to purchase " + storeInventory.get(searchProductResult).getName() + "?");
            String answer= scan.nextLine();
            if(answer.equalsIgnoreCase("y")){
                System.out.println("You have purchased" + requestedProduct);
                
            }
            else if (answer.equalsIgnoreCase("n")){
                System.out.println("Sorry for the inconvience");
                sheshon=false;
            }
            
        }else {
            System.out.println("Sorry, you're too broke");
            sheshon = false;
           

        }
    
    }
    }
   // }
    

}






}// end of class
