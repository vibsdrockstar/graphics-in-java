import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class Hangman extends Applet{
public Hangman(){
	setName("Hangman");
	setVisible(true);
	setSize(500,400);

}	

public void paint(Graphics g){
	g.setColor(Color.green);
	g.fillArc(20, 15, 80, 100, 40, 320);
}
}
	
	



