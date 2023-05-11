package sistema;

public class Xampu extends Produto{
	
	private String tipoCabelo;
	private String volume;
	private String composição;
	
	

	public Xampu(String nome, String fabricante, String codBarras, double preco, Estoque estoque,
				String tipoCabelo, String volume, String composição) {
		
		super(nome, fabricante, codBarras, preco, estoque);
		this.tipoCabelo = tipoCabelo;
		this.volume = volume;
		this.composição = composição;
	}

	public String getTipoCabelo() {
		return tipoCabelo;
	}

	public void setTipoCabelo(String tipoCabelo) {
		this.tipoCabelo = tipoCabelo;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getComposição() {
		return composição;
	}

	public void setComposição(String composição) {
		this.composição = composição;
	}

	@Override
	public String toString() {
		return "Xampu [tipoCabelo=" + tipoCabelo + ", volume=" + volume + ","
				+ "composição=" + composição + ", toString()=" + super.toString() + "]";
	}	
}
