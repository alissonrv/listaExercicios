package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroCliente extends JFrame{
	JPanel panelNorte, panelCentro;
	JLabel clienteLabel, nomeLabel, cpfLabel;
	JTextField nomeField, cpfField;
	JButton adicionarButton;
	
	
	public CadastroCliente() {
		super("Cadastro");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		panelNorte = new JPanel();
		panelCentro = new JPanel();
		
		clienteLabel = new JLabel("Cliente");
		clienteLabel.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		
		nomeLabel = new JLabel("Nome ");
		cpfLabel = new JLabel("CPF ");
		
		try {
			nomeField = new JTextField();
			nomeField.setColumns(15);
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(9);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		adicionarButton = new JButton("Adicionar");
//		adicionarButton.setPreferredSize(new Dimension(150, 50));
		
		panelNorte.add(clienteLabel);
		panelCentro.add(nomeLabel);
		panelCentro.add(nomeField);
		panelCentro.add(cpfLabel);
		panelCentro.add(cpfField);
		panelCentro.add(adicionarButton);
		
		add(panelNorte, BorderLayout.NORTH);
		add(panelCentro, BorderLayout.CENTER);
//		add(adicionarButton, BorderLayout.SOUTH);
		
		setVisible(false);
	}
}
