import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JLabel;
public class Hangman extends Applet{
private static final Component Hangman = null;


public void init(){
	this.resize(800, 800);
	

}	


public void paint(Graphics g){
	g.setColor(Color.black);
	g.fillRect(0, 0, 800, 800);
	
g.setColor(Color.green);
Font whatever=new Font("anything",Font.BOLD,26);
setFont(whatever);
g.drawString("Hello I am Vibhor", 200,200);

	
}
}	
	



