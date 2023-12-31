import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;

public class Menuingame   {

	public Rectangle resumeButton = new Rectangle(270, 150, 120, 50);
	public Rectangle exitButton = new Rectangle(270, 250, 120, 50);
	
	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.black); 
		
		Font fnt1 = new Font("arial", Font.BOLD, 30); 
		g.setFont(fnt1);
		g2d.setColor(Color.gray);
		g2d.fill(resumeButton);
		
		g2d.setColor(Color.black);
		g.drawString("Resume", resumeButton.x + 2, resumeButton.y + 30);
		g2d.draw(resumeButton);
		
		g2d.setColor(Color.gray);
		g2d.fill(exitButton);
		
		g2d.setColor(Color.black);
		g.setColor(Color.black);
		g.drawString("Exit", exitButton.x + 19, resumeButton.y + 130);
		g2d.draw(exitButton);		
	}	
}