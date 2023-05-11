package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CadastroGUI extends JFrame{
	JPanel panel;
	JButton clienteButton, funcionarioButton;
	
	public CadastroGUI() {
		super("Cadastro");
		setSize(200, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.setSize(200, 200);
//		panel.setLayout(new FlowLayout());
		
		clienteButton = new JButton("Cliente");
		funcionarioButton = new JButton("Funcionário");
		
		panel.add(clienteButton);
		panel.add(funcionarioButton);
		
		add(panel);
		setVisible(true);
	}

	public JButton getClienteButton() {
		return clienteButton;
	}
}
