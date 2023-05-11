package model;

import java.util.ArrayList;

import controller.CpfException;
import controller.Validador;
import view.Mensagem;

public class BaseDados {
	private static ArrayList<Cliente> clientes;
	private static final String CLIENTE_NULL = "Erro ao adicionar o cliente: dados inválidos";
	private static final String CLIENTE_EXISTE = "Erro ao adicionar o cliente: já existe na base!";
	
	public static void createBase() {
		clientes = new ArrayList<Cliente>();
	}
	
	public static void inicializarBase() {
		createBase();
//		adicionarCliente(new Cliente("111.111.111-11", "Alisson Rocha Vidal"));
	}
	public static boolean adicionarCliente(Cliente cliente) throws CpfException{
		if(cliente==null) {
			Mensagem.exibirMensagem(CLIENTE_NULL);
			return false;
		}
		else if(isCliente(cliente)) {
			Mensagem.exibirMensagem(CLIENTE_EXISTE);
			return false;
		}
		else {
			try {
				if(Validador.validarCPF(cliente.getCpf()))
					return clientes.add(cliente);
			} catch (CpfException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public static Cliente buscarCliente(Cliente cliente) {
		for(Cliente clienteCurrent : clientes) {
			if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf())) 
				return clienteCurrent;	
		}
		return null;
	}
	
	public static Cliente buscarCliente(String cpf) {
		for(Cliente clienteCurrent : clientes) {
			if(clienteCurrent.getCpf().equalsIgnoreCase(cpf)) 
				return clienteCurrent;	
		}
		return null;
	}
	
	public static boolean isCliente(Cliente cliente) {
		if(clientes.contains(buscarCliente(cliente)) && clientes.contains(buscarCliente(cliente.getCpf())))
			return clientes.contains(buscarCliente(cliente));
		return false;
	}
	
	public static ArrayList<Cliente> getClientes(){
//		 ArrayList<Cliente> exibirClientes = new ArrayList<Cliente>();
		 return clientes;
	}
}
