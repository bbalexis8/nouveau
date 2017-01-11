package cours;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel {

	private int i=0;


	public void paintComponent(Graphics g){
		System.out.println("Execution numéro : " + (i++));
		int a = Math.min(this.getWidth()/2, this.getHeight()/2);
		g.setColor(Color.red);
		//ajout ligne horizontale
		g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
		//ajout ligne verticale
		g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
		g.setColor(Color.GREEN);
		g.fillPolygon(new int[] {0,this.getWidth()/4,this.getWidth()/2}, new int[] {this.getHeight()/2,0,this.getHeight()/2}, 3);
		g.setColor(Color.blue);
		g.fillRect((this.getWidth()/2)+((this.getWidth()/2)-a)/2, ((this.getHeight()/2)-a)/2, a, a);
		g.setColor(Color.orange);
		g.fillOval(((this.getWidth()/2)-a)/2, ((this.getHeight()/2)-a) + this.getHeight()/2, a, a);

		/*Image img = null;

		try{
			img = ImageIO.read(new File("LOGO.jpg"));

		} catch (IOException e){
			e.printStackTrace();
		}
		g.drawImage(img, this.getWidth()/2, this.getHeight()/2, this.getWidth(), this.getHeight()/2, this);*/
	}
}
