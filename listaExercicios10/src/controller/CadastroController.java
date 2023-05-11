package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.CadastroCliente;
import view.CadastroGUI;

public class CadastroController {
	CadastroGUI cadastroGUI;
	CadastroCliente cadastroCliente;
	buttonHandler buttonHandler;
	
	public CadastroController(CadastroGUI cadastroGUI, CadastroCliente cadastroCliente) {
		this.cadastroGUI = cadastroGUI;
		this.cadastroCliente = cadastroCliente;
		cadastroGUI.getClienteButton().addActionListener(buttonHandler = new buttonHandler());
	}

	private class buttonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==cadastroGUI.getClienteButton()) {
				cadastroGUI.setVisible(false);
				cadastroCliente.setVisible(true);
			}	
		}	
	}
}