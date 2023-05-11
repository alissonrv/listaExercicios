package app;

import java.awt.font.TextLayout;

import controller.CadastroController;
import controller.CpfException;
import model.BaseDados;
import model.Cliente;
import view.CadastroCliente;
import view.CadastroGUI;

public class App {
	public static void main(String[] args) {
		CadastroGUI cadastroGUI = new CadastroGUI();
		CadastroCliente cadastroCliente = new CadastroCliente();
		new CadastroController(cadastroGUI, cadastroCliente);
		
		BaseDados.inicializarBase();
		
		Cliente cliente1 = new Cliente("057.525.023-22", "Alisson");
		Cliente cliente2 = new Cliente("777.202.180-27", "Tailson");
//		Cliente cliente3 = null; //new Cliente("333.333.333-33", "Leonardo");
		
		
		
		try {
			BaseDados.adicionarCliente(cliente1);
			BaseDados.adicionarCliente(cliente2);
		} catch (CpfException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		BaseDados.adicionarCliente(cliente3);
	}
}
