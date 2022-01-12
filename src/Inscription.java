import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Inscription {
	public static void inscription() {
		JFrame Men = new JFrame("Ajout");
		Men.setSize(400,200);
		
		JPanel pa=new JPanel();
		Men.setContentPane(pa);
		
		JTextField insc = new JTextField(10);
		
		JButton Accept = new JButton("Inscription");
		Men.getContentPane().add(Accept);
		
		Men.setVisible(true);
		
		Accept.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent c) {
				new Identification(insc.getText());
				
			}
			
		});
	}
}
