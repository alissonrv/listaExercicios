package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.Tela2;

public class ButtonHandler2 implements ActionListener{
	Tela2 tela2;
	
	public ButtonHandler2(Tela2 tela2) {
		this.tela2 = tela2;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tela2.getButtonSetVisible()) {
			tela2.setVisible(false);
			JOptionPane.showMessageDialog(null, "Evento tratado em outra classe!!");
		}
	}
}
