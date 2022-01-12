
import java.awt.event.*;

import javax.swing.*;



public class Fenetre {
	public static int essai;
	public static void fenetre(){
		essai=0;
		JFrame fen = new JFrame("Identification");
		fen.setSize(400,200);
		
		JPanel pan=new JPanel();
		fen.setContentPane(pan);
		
		JButton bouton = new JButton("Connexion");
		fen.getContentPane().add(bouton);
		
		JTextField t = new JTextField(10);
		fen.getContentPane().add(t);
		
		JLabel l=new JLabel("Identifiez-Vous");
		fen.getContentPane().add(l);
		
		fen.setVisible(true);
		
		//fermer la fentre pour eviter les bugs
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				if (t.getText()=="Julien") {
					
					Inscription.inscription();
					
				}
				else {		

					JButton boutonSuivant = new JButton("Aller voter");
					//Action
					
					bouton.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
							String nom = "Vous êtes connecté en tant que " +t.getText();
							l.setText(nom);
							
							if (essai==0)
									{
								essai=1;
							fen.getContentPane().add(boutonSuivant);
							}
							
						}
						
					});
					boutonSuivant.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent v) {
							Musique.vote();
							
							}
					});
				}
			}
		});
		
	}
}
