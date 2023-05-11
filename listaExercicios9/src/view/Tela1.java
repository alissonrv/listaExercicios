package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela1 extends JFrame{
	JButton button;
	Tela2 tela2;
	
	public Tela1(Tela2 tela2) {		
		super("Como fechar um JFrame");
		this.tela2 = tela2;
		setSize(400, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		button = new JButton("Abrindo outro JFrame");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tela 2 será aberta!!");
				tela2.setVisible(true);
			}
		});
		
		add(button);
		
		setVisible(true);
	}
}
