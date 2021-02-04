package exercicioTransporte;

public class Aviao {

	private String nome;
	private String tipo;
	private double quantidadeBarulho;
	private String tipoTurbina;
	private String cor;
	public Aviao(String nome, String tipo, double quantidadeBarulho, String tipoTurbina, String cor) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.quantidadeBarulho = quantidadeBarulho;
		this.tipoTurbina = tipoTurbina;
		this.cor = cor;
	}
	
	public void resgatarCaixaPreta() {
		System.out.println("Caixa preta resgatada");
	}
	
	public void soltarMascarasOxigenio() {
		System.out.println("Soltar máscaras de oxigênio");
	}
	
	public void liberarEscorregadorEmergencia() {
		System.out.println("Podem escorregar passageiros!");
	}
	
	public void soltarCombustivel() {
		System.out.println("Liberando peso do avião");
	}
	
	public void comunicarBaseAerea() {
		System.out.println("Pedindo permissão para pousar");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getQuantidadeBarulho() {
		return quantidadeBarulho;
	}
	public void setQuantidadeBarulho(double quantidadeBarulho) {
		this.quantidadeBarulho = quantidadeBarulho;
	}
	public String getTipoTurbina() {
		return tipoTurbina;
	}
	public void setTipoTurbina(String tipoTurbina) {
		this.tipoTurbina = tipoTurbina;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
