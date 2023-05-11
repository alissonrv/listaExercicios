package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Tela extends JFrame{
	
	JPanel panelNorte, panelCentro;
	JLabel labelCadastrar, labelTipo, labelNome, labelCPF, labelFone, labelEmail;
	JButton buttonAdicionar;
	JCheckBox checkBox;
	JRadioButton clienteRadioButton, funcionarioRadioButton;
	ButtonGroup bg;

	public Tela(){
		super("Gerenciar Dados");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		panelNorte = new JPanel();
		panelNorte.setSize(100, 100);
		panelCentro = new JPanel(new SpringLayout());
		panelCentro.setSize(100, 100);
		
		labelCadastrar = new JLabel("Cadastrar");
		labelCadastrar.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		labelTipo = new JLabel("Tipo:");
		labelNome = new JLabel("Nome:");
		labelCPF = new JLabel("CPF:");
		labelFone = new JLabel("Fone:");
		labelEmail = new JLabel("Email:");
		
		buttonAdicionar = new JButton("Adicionar");
		
		checkBox = new JCheckBox("Aceita receber propaganda?");
		
		String[] labels = {"Nome: ", "CPF: ", "Fone: ", "Email: "};
		int numPairs = labels.length;
		
		for (int i = 0; i < numPairs; i++) {
		    JLabel l = new JLabel(labels[i], JLabel.TRAILING);
		    panelCentro.add(l);
		    JTextField textField = new JTextField(10);
		    l.setLabelFor(textField);
		    panelCentro.add(textField);
		}
		SpringUtilities.makeCompactGrid(panelCentro,
                numPairs, 2, //rows, cols
                6, 6,        //initX, initY
                6, 6);       //xPad, yPad
		
		panelNorte.add(labelCadastrar);
		
		add(panelNorte, BorderLayout.NORTH);
		add(panelCentro, BorderLayout.CENTER);
		add(buttonAdicionar, BorderLayout.EAST);
		add(checkBox, BorderLayout.PAGE_END);
		
		setVisible(true);
	}
}
