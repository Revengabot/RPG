package RPG;

public class Product { 
    //variables for the parameters of the product object
    private String name = ""; 
    private int health = 0;
    private int attackBoost = 0;
    private int price = 0; 

//Constructor
public Product(String name, int health, int attackBoost, int price) {
    
 this.name =  name; 
 this.health =  health;
 this.attackBoost = attackBoost;
 this.price = price;

}

//Getters
 public String getName () {
    return this.name;
    }
    
public int getHealth () {
    return this.health;
}

public int getAttackBoost () {
	return this.attackBoost;
    }
    
public int getPrice () {
    return this.price;
}


//Setters

 //public Object setProduct(String name , int health , int attackBoost , int price ){
 
 //Object product = name + health + attackBoost + price;
 //return product;
 
 //}




}
//end of class
