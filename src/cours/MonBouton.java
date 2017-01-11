package cours;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MonBouton extends Button implements MouseListener {

	public MonBouton(String label){
		
		super(label);
		addMouseListener(this);
		this.setBackground(Color.BLUE);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		this.setBackground(Color.YELLOW);
		System.out.println("Pressé !");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		this.setBackground(Color.RED);
	}

	@Override
	public void mouseExited(MouseEvent e) {

		this.setBackground(Color.BLUE);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		this.setBackground(Color.blue);
		System.out.println("Relâché !");
	}

}
