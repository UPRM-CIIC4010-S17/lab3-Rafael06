import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1957578830309327460L;
	public static void main(String[] args) {
	
	}
		// TODO Auto-generated method stub
		
		 public void paintComponent(Graphics g) {
             super.paintComponent(g);

             //Compute interior coordinates
             Insets myInsets = this.getInsets();
             int x1 = myInsets.left;
             int y1 = myInsets.top;
             int x2 = getWidth() - myInsets.right - 1;
             int y2 = getHeight() - myInsets.bottom - 1;
             int width = x2 - x1;
             int height = y2 - y1;

             //Paint the background
             g.setColor(Color.GRAY);
             g.fillRect(x1, y1, width + 1, height + 1);
           
             
             //Draw a border
             g.setColor(Color.GRAY);
             g.drawRect(x1 + 50, y1 + 50, width - 90, height - 162);
             
             g.setColor(Color.RED);
             g.fillRect(x1 + 51, y1 + 51, width - 91, height - 320);
             
             g.setColor(Color.WHITE);
             g.fillRect(x1 + 51, y1 + 90, width - 91, height - 320);
             
             g.setColor(Color.RED);
             g.fillRect(x1 + 51, y1 + 129, width - 91, height - 320);
             
             g.setColor(Color.WHITE);
             g.fillRect(x1 + 51, y1 + 168, width - 91, height - 320);
             
             g.setColor(Color.RED);
             g.fillRect(x1 + 51, y1 + 207, width - 91, height - 320);
             
             
          
           
            //g.setColor(Color.WHITE);
            //g.drawLine(x1 + 50, y1 + 50, x2 - 228, y2 - 228);
            
            //g.setColor(Color.green);
            //g.drawLine(x1 - 20, y2 - 20, x2 - 25, y1 - 25);
            
            // Draw a Oval
           // g.setColor(Color.LIGHT_GRAY);
            //g.fillOval(160, 145, 55, 55);
            
            //Draw a Polygon
            //Polygon p = new Polygon();
            //p.addPoint(x1 + 5, y1 + 25);
            //p.addPoint(x1 + 20, y1 + 10);
            //p.addPoint(x1 + 35, y1 + 25);
            //p.addPoint(x1 + 25, y1 + 25);
            //p.addPoint(x1 + 25, y1 + 45);
            //p.addPoint(x1 + 15, y1 + 45);
            //p.addPoint(x1 + 15, y1 + 25);
            //g.setColor(Color.YELLOW);
            //g.fillPolygon(p);
             g.setColor(Color.BLUE);
             g.fillPolygon(  new int [] {50, 50, 160}, new int[] {250, 49, 150}, 3);
             
             g.setColor(Color.WHITE);
             g.fillPolygon(  new int [] {80, 88, 100}, new int[] {140, 120, 140}, 3);
             
             g.setColor(Color.WHITE);
             g.fillPolygon(  new int [] {100, 100, 120}, new int[] {160, 139, 145}, 3);
             
             g.setColor(Color.WHITE);
             g.fillPolygon(  new int [] {85, 100, 110}, new int[] {166, 156, 180}, 3);
             
             g.setColor(Color.WHITE);
             g.fillPolygon(  new int [] {60, 81, 82}, new int[] {143, 139, 160}, 3);
             
             g.setColor(Color.WHITE);
             g.fillPolygon(  new int [] {70, 79, 95}, new int[] {180, 158, 169}, 3);
             
             g.setColor(Color.WHITE);
             g.fillRect(x1 + 81, y1 + 140, width - 363, height - 335);
             
             
            
            
            
	}

}