import java.awt.Graphics;
import java.awt.Color;
import java.applet.*;

public class Drawwww extends Applet
{
	public void init()
	{
		
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(50,30,50,50);
		g.setColor(Color.blue);
		g.fillRect(20, 20, 100, 50);
		
	}

}
