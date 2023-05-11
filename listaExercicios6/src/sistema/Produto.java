package sistema;

public class Produto {
	
	private String nome;
	private String fabricante;
	private String codBarras;
	private double preco;
	private Estoque estoque;
	
	public Produto(String nome, String fabricante, String codBarras, double preco, int quantidade) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.codBarras = codBarras;
		this.preco = preco;
		estoque = new Estoque(quantidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", fabricante=" + fabricante + ","
				+ "codBarras=" + codBarras + ", preco=" + preco + ", estoque=" + estoque + "]";
	}
}