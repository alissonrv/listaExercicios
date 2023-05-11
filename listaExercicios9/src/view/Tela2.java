package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.ButtonHandler2;

public class Tela2 extends JFrame implements ActionListener{
	JButton buttonHide, buttonDispose, buttonSetVisible, buttonSystemExit;
//	Tela1 tela1;
	ButtonHandler2 buttonHandler2;
	
	public Tela2() {		
		super("Quero fechar essa tela");
//		this.tela1 = tela1;
		setSize(600, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setResizable(true);	//redimensionar o tamanho do Jframe
		setLayout(new FlowLayout());
		
		buttonHide = new JButton("hide()");
		buttonDispose = new JButton("dispose()");
		buttonSetVisible = new JButton("setVisible()");
		buttonSystemExit = new JButton("System.exit(0)");
		
		buttonHandler2 = new ButtonHandler2(this);
		
		buttonHide.addActionListener(this);
		buttonSystemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Evento tratado em classe interna anônima!!");
				System.exit(0);				
			}
		});
		buttonDispose.addActionListener(new ButtonHandler());
		buttonSetVisible.addActionListener(buttonHandler2);
		
		add(buttonHide);
		add(buttonDispose);
		add(buttonSetVisible);
		add(buttonSystemExit);
		
		setVisible(false);
	}
	
	public JButton getButtonSetVisible() {
		return buttonSetVisible;
	}

	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==buttonHide) {
			setVisible(false);
			JOptionPane.showMessageDialog(null, "Evento tratado na própria classe!!");
		}
	}
	
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getSource()==buttonDispose) {
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Evento tratado em classe interna!!");
			}
		}	
	}
}