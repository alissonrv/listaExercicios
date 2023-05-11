package sistema;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import sistemaSupermercado.Produto;

public class BaseDados {
	
	public static ArrayList<Produto> produtos;
	
	public static void createBase() {
		produtos = new ArrayList<Produto>();
	}
	
	public static void inicializarBase() {
		createBase();
		adicionarProduto(new Produto("Feijão da Serra",
									"Biju",
									"PROD001",
									9.00,
									500));
		adicionarProduto(new Produto("Laranja formosa",
									"CitrusBR",
									"PROD003",
									0.50,
									100));
	}	
	
	public static boolean adicionarProduto(Produto produto) {
		if(produto!=null)
			return produtos.add(produto);
		
		return false;
	}
	
//	public static Produto buscarProduto(Produto produto) {
//		for(Produto produtoCurrent : produtos) {
//			if(produtoCurrent.getCodBarras().equalsIgnoreCase(produto.getCodBarras())) {
//				System.out.println("Produto encontrado! " + produtoCurrent.getCodBarras());
//				return produtoCurrent;
//			}
//			
//			System.out.println("Produto não encontrado!");
//		}
//		return null;
//	}
	
	public static Produto buscarProduto(String codBarras) {
		for(Produto produtoCurrent : produtos) {
			if(produtoCurrent.getCodBarras().equalsIgnoreCase(codBarras)) {
				JOptionPane.showMessageDialog(null,"Produto encontrado!\n" + produtoCurrent.getCodBarras());
				return produtoCurrent;
			}
		}//verificar depois se é dentro ou fora do "for"
		JOptionPane.showMessageDialog(null,"Produto não encontrado!");
		return null;
	}
	
	public static boolean isProduto(Produto produto) {
		return produtos.contains(buscarProduto(produto.getCodBarras()));
	}
	
//	public static boolean atualizarEstoque(Estoque estoque) {
//		
//	}
	
	public static ArrayList<String> exibirProduto(){
		int i;
		for(Produto produtoCurrent:produtos) {
			return produtos.get(i).getNome();
			i++;
		}
		return null;
	}
	
//	public static ArrayList<Produto> getProdutos() {
//		for(Produto produtoCurrent:produtos) {
//			return produtoCurrent;
//		}
//	}

	public void operation0() {
		
	}
}
