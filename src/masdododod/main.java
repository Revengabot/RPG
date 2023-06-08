package masdododod;

import javax.swing.JFrame;

import java.awt.Window;

import javax.swing.ImageIcon;


public class main {
	
	public static JFrame window;

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Slordge Adventure");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamePanel.startGameThread();
		
	
		
	}
	
	
	


}
