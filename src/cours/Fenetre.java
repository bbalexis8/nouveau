package cours;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Fenetre extends JFrame {

	protected JPanel pan = new JPanel();
	protected JButton bouton = new JButton("Mon Bouton");
	protected JCheckBox check1 = new JCheckBox("Connecté ?");
	protected JCheckBox check2 = new JCheckBox("Hors ligne ?");
	protected JCheckBox check3 = new JCheckBox("Erreur réseau");
	protected JRadioButton b1 = new JRadioButton("oui");
	protected JRadioButton b2 = new JRadioButton("non");
	protected ButtonGroup groupe = new ButtonGroup();
	protected ButtonGroup groupe2 = new ButtonGroup();
	protected JLabel label = new JLabel("Mon étiquette");
	/*protected JLabel label2 = new JLabel("Rouge");
	protected JLabel label3 = new JLabel("Bleu");
	protected JLabel label4 = new JLabel("Vert");*/
	protected JTextField text = new JTextField();
	protected JComboBox<Object> combo = new JComboBox<>();
	
	protected JPanel panel = new JPanel();
	
	
	public Fenetre(){
		
		this.setTitle("Fenêtre d'essai");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.white);
		this.getContentPane().setVisible(false);
		this.getContentPane().setBackground(Color.BLUE);
		this.setVisible(false);
		
		
		
		this.setContentPane(pan);
		this.setTitle("Mon premier panel");
		this.setSize(500,500);
		this.getContentPane().setBackground(Color.ORANGE);
		//this.setLayout(new BorderLayout()); //1- organise les elements de la fenetre en haut, en bas, au centre, a gauche et a droite
		//this.setLayout(new GridLayout(3, 2)); //2- organise les elements de la fenetre dans une grille
		text.setPreferredSize(new Dimension (100,25));
		
		
		this.setContentPane(new Panneau());
		this.setVisible(true);
		
		//Ajout d'un bouton a la fenetre
		/*pan.add(bouton);
		
		//Ajout cases a un groupe
		groupe2.add(check1);
		groupe2.add(check2);
		groupe2.add(check3);
		//Ajout des cases a la fenetre
		pan.add(check1);
		pan.add(check2);
		pan.add(check3);
		//Ajout de radio boutons au groupe 1
		groupe.add(b1);
		groupe.add(b2);
		//Ajout de radio boutons a la fenetre
		pan.add(b1);
		pan.add(b2);
		b1.setSelected(true);
		//Ajoute un arriere plan a l etiquette
		label.setBackground(Color.white);
		label.setOpaque(true);
		//Ajout de l etiquette et de champ a saisir a la fenetre
		pan.add(label);
		pan.add(text);
		//Ajout des parametres a la liste deroulante jcombobox
		combo.addItem("Rouge");
		combo.addItem("Bleu");
		combo.addItem("Jaune");
		//Aajoute la liste a la fenetre
		pan.add(combo);*/
		
		/*this.getContentPane().add(bouton, BorderLayout.CENTER);
		this.getContentPane().add(check1, BorderLayout.NORTH);
		this.getContentPane().add(check2, BorderLayout.SOUTH);
		this.getContentPane().add(b1, BorderLayout.WEST);
		this.getContentPane().add(b2, BorderLayout.EAST);*/
		
		// 1-
		/*this.getContentPane().add(new JButton("CENTRE"), BorderLayout.CENTER);
		this.getContentPane().add(new JButton("NORD"), BorderLayout.NORTH);
		this.getContentPane().add(new JButton("SUD"), BorderLayout.SOUTH);
		this.getContentPane().add(new JButton("OUEST"), BorderLayout.WEST);
		this.getContentPane().add(new JButton("EST"), BorderLayout.EAST);*/
		
		// 2-
		/*this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));
		this.setVisible(true);*/
		
		// 3- permet de ranger les composants a la suite sur une ligne ou dans une colonne
		/*JPanel p1 = new JPanel();
		
		p1.setLayout(new GridLayout(0,1));
		p1.add(new JButton("Bouton 1"));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0,1));
		p2.add(new JButton("Bouton 2"));
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(0,1));
		p3.add(new JButton("Bouton 3"));
		
		JPanel p4 = new JPanel();
		p4.setLayout(new BoxLayout(p4, BoxLayout.LINE_AXIS));
		p4.add(new JButton("Bouton 4"));
		p4.add(new JButton("Bouton 5"));
		p4.add(new JButton("Bouton 6"));
		
		JPanel p5 = new JPanel();
		p5.setLayout(new GridLayout(0,3));
		p5.add(new JButton("Bouton 7"));
		p5.add(new JButton("Bouton 8"));
		
		
		JPanel p6 = new JPanel();
		p6.setLayout(new BoxLayout(p6, BoxLayout.PAGE_AXIS));
		p6.add(p1);
		p6.add(p2);
		p6.add(p3);
		p6.add(p4);
		p6.add(p5);
		
		this.getContentPane().add(p6);
		this.setVisible(true);*/
		
		// version johan
		/*JPanel menu = new JPanel();
		menu.setPreferredSize(new Dimension(250, 250));
		menu.setLayout(new BoxLayout(menu, BoxLayout.PAGE_AXIS));
		menu.add(new Button("1"));
		menu.add(new Button("2"));
		menu.add(new Button("3"));
		
		JPanel grid = new JPanel(new GridLayout(2, 3));
		grid.add(new Button("5"));
		grid.add(new Button("6"));
		grid.add(new Button("7"));
		grid.add(new Button("8"));
		
		menu.add(grid);
		
		this.getContentPane().add(menu);
		this.setVisible(true);*/
		
		
		// 4 - Cardlayout : organise les elements sous forme d onglets
		/*CardLayout cl = new CardLayout();
		JPanel content = new JPanel();
		String listcontent[] = {"Onglet_1", "Onglet_2", "Onglet_3"};
		int indince = 0;
		
		JPanel onglet1 = new JPanel();
		onglet1.setBackground(Color.blue);
		JPanel onglet2 = new JPanel();
		onglet2.setBackground(Color.white);
		JPanel onglet3 = new JPanel();
		onglet3.setBackground(Color.red);
		
		JPanel boutonpane = new JPanel();
		JButton bouton1 = new JButton("Contenu suivant");
		pan.add(onglet1);
		pan.add(onglet2);
		pan.add(onglet3);
		
		this.setVisible(true);*/
		
		
		
		
	}
}
