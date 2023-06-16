package masdododod;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Window;

import javax.swing.ImageIcon;


public class Main {
	
	public static JFrame window;
	static ImageIcon image1 = new ImageIcon("C:/Users/sarah/eclipse-workspace/gamegame/Slordge.png");
	static ImageIcon image2 = new ImageIcon("C:/Users/sarah/eclipse-workspace/gamegame/ghost.png");
	static ImageIcon image3 = new ImageIcon("C:/Users/sarah/eclipse-workspace/gamegame/mushroom.png");
	static ImageIcon image4 = new ImageIcon("C:/Users/sarah/eclipse-workspace/gamegame/goomba.png");

	public static void main(String[] args) {
		
		
//		gamePanel.startGameThread();
		
		
	}
	
	public static void slime() {
		JFrame window = new JFrame();
		window.setIconImage(new ImageIcon("C:/Users/sarah/eclipse-workspace/gamegame/Slordge.png").getImage());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Slordge Adventure");
		
//		GamePanel gamePanel = new GamePanel();
//		window.add(gamePanel);
		

		
		window.add(new JLabel(image1));
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
	}
	
	public static void ghost() {
		JFrame window = new JFrame();
		window.setIconImage(new ImageIcon("C:/Users/sarah/eclipse-workspace/gamegame/ghost.png").getImage());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Ghost Adventure");
		
//		GamePanel gamePanel = new GamePanel();
//		window.add(gamePanel);
		

		
		window.add(new JLabel(image2));
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
	}
	
	public static void mushroom() {
		JFrame window = new JFrame();
		window.setIconImage(new ImageIcon("C:/Users/sarah/eclipse-workspace/gamegame/mushroom.png").getImage());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Mushroom Adventure");
		
//		GamePanel gamePanel = new GamePanel();
//		window.add(gamePanel);
		

		
		window.add(new JLabel(image3));
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
	}
	
	public static void goomba() {
		JFrame window = new JFrame();
		window.setIconImage(new ImageIcon("C:/Users/sarah/eclipse-workspace/gamegame/goomba.png").getImage());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Goomba Adventure");
		
//		GamePanel gamePanel = new GamePanel();
//		window.add(gamePanel);
		

		
		window.add(new JLabel(image4));
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
	}
	
	
	
	
	
	


}
