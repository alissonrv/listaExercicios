package sistema;

public class Sabonete extends Produto {
	
	private String fragancia;
	private double peso;
	private String composicao;
	
	public Sabonete(String nome, String fabricante, String codBarras, double preco,
					Estoque estoque, String fragancia, double peso, String composicao) {
		
		super(nome, fabricante, codBarras, preco, estoque);
		this.fragancia = fragancia;
		this.peso = peso;
		this.composicao = composicao;
	}

	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getComposicao() {
		return composicao;
	}

	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}

	@Override
	public String toString() {
		return "Sabonete [fragancia=" + fragancia + ", peso=" + peso + ","
				+ "composicao=" + composicao + ", toString()=" + super.toString() + "]";
	}	
}
