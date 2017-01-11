package cours;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MaFenetre extends JFrame implements MouseListener {


	public MaFenetre(){

		super("Une fenêtre qui traite les clics souris");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		this.setContentPane(panel);
		MonBouton bouton = new MonBouton("Bouton");
		panel.add(bouton);
		setVisible(true);

		//la fenetre fait appel a son propre ecouteur d evenements
		addMouseListener(this);

	}

	//l argument e de type MouseEvent correspond a l objet evenement 
	//genere dans la fenetre lors dun clic souris. on peut utiliser 
	//les infos qui lui sont associees.

	@Override
	public void mouseClicked(MouseEvent e) {

		int x = e.getX();
		int y = e.getY();
		//coordonnees du curseur de la souris au moment du clic
		System.out.println("clic dans la fenêtre au point de coordonnées " + x + ", " + y);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
