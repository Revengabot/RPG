package RPG;




public abstract class Character {

	private String name;
	private int HP;
	private int attack;
	private boolean defense;
	private int Coin;

	
	public Character(String name, int attack, int HP, int coin) {
		
		this.name = name;
		this.attack = attack;

		this.HP = HP;
		this.Coin = coin;
		
	}
	
	
	
	
	
	//getters
	
	

	public String getName() {
		return this.name;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public boolean getDefense() {
		return this.defense;
	}
	
	public int getHP() {
		return this.HP;
	}
	
	public int getCoin() {
		return this.Coin;
	}
	
	

	
	//setter
	
	public void setAttack(int playAttack ) {
		this.attack= playAttack;
	}
	
	public void setHP (int playHP) {
		this.HP = playHP;
	}
	
	public void setCoin (int coin) {
		this.Coin= coin;
	}
	
	public void setName(String name) {
		this.name=name;
	}


}//end of class

