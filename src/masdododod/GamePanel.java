package masdododod;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	//screen settings
	final int orginalTileSize = 16; //16x16 title
	final int imageScale =3;
	
	final int tileSize= orginalTileSize *imageScale;
	final int maxScreenColom = 16;
	final int maxScreenRow = 12; 
	final int screenWidth = tileSize * maxScreenColom; //758 pixels 
	final int screenHeight = tileSize * maxScreenRow; //576 pixels
	
	KeyHandler keyH = new KeyHandler();
	Thread gameThread;
	
	
	//set player position
	int playerX= 100;
	int playerY= 100;
	int playerSpeed = 4;
	
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);

	}


	public void startGameThread() {
		gameThread= new Thread(this);
		gameThread.start();
		
		
	}
	
	
	
	public void run() {
		
		while(gameThread!= null) {
//			System.out.println("The game loop skshkd");
//1. update: update information such as character position
			update();
			
//2. draw: draw the screen with the updated information
			repaint();
			
				
		}
	
		
		
	}
	
	public void update() {
		
		if(keyH.upPressed == true) {
			
			playerY -= playerSpeed;
			
		}else if(keyH.downPressed == true) {
			
			playerY += playerSpeed;
			
		}else if(keyH.leftPressed == true) {
			
			playerX -= playerSpeed;
			
		}else if(keyH.rightPressed == true) {
			
			playerX += playerSpeed;
			
		}
		
		}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2 =(Graphics2D)g;
		g2.setColor(Color.white);
		g2.fillRoundRect(playerX, playerY, tileSize, tileSize, 7, 9);
		g2.dispose();
	}
	
	
	
	
}
