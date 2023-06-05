

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	//screen settings
	final int orginalTileSize = 16; //16x16 title
	final int imageScale =3;
	
	final int titleSize= orginalTileSize *imageScale;
	final int maxScreenColom = 16;
	final int maxScreenRow = 12; 
	final int screenWidth = titleSize * maxScreenColom; //758 pixels 
	final int screenHeight = titleSize * maxScreenRow; //576 pixels
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		
		
	}
	

	
	
	
	
}
