import java.awt.*;

import javax.swing.*;

public class CBoard extends JFrame{

	int x=50;
	int y= 50;
	int rad=50;
	
	 CBoard()
	 {
	
	    setTitle("ball");
		setSize(500, 500);
		setVisible(true);
		
	}
	 void move()
	 {
		 if(y<getHeight()-rad)
		 {
			 y=y+1;
			 
		 }
		 
			 
	 }
	 public void paint(java.awt.Graphics g)
	 {
		 super.paint(g);
		 g.fillOval(x, y, rad, rad);
		 
	 }
	public static void main(String[] args){
	CBoard c=new CBoard();
	while(true)
	{
		c.move();
		c.repaint();
		try
		 {
			 Thread.sleep(1);
			 
		 }
		 catch(Exception e)
		 {
			 
		 }
	}	
	}
  
	}
	


