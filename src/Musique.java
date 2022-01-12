import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Musique {
	public int Vote;
	public String nom;
	public int ID;
	
	public Musique() {	
	}
	
	
	public static void vote() {
		JFrame fenV = new JFrame("Vote");
		fenV.setSize(400,200);
		
		JPanel pan=new JPanel();
		fenV.setContentPane(pan);
		
		JTextField t = new JTextField(10);
		fenV.getContentPane().add(t);
		
		JButton bouton = new JButton("Votez");
		fenV.getContentPane().add(bouton);
		
		JLabel l=new JLabel("");
		fenV.getContentPane().add(l);
		
		fenV.setVisible(true);
		
		
		
		//Action
		
		bouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String nom = "Vous avez voter pour la musique : " +t.getText();
				l.setText(nom);
			}
		});
	}
	
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
