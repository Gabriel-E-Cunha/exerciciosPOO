package exercicioClasses;

public class Carro {

	private String modelo;
	private int ano;
	private String cor;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private double preco;
	private String paisOrigem;
	private int numeroSerie;
	private double anguloEstercaoAtual;
	private double anduloEstercaoMaximo;
	
	public Carro(String modelo, int ano, String cor, double velocidadeAtual, double velocidadeMaxima, double preco,
			String paisOrigem, int numeroSerie, double anguloEstercaoAtual, double anduloEstercaoMaximo) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
		this.preco = preco;
		this.paisOrigem = paisOrigem;
		this.numeroSerie = numeroSerie;
		this.anguloEstercaoAtual = anguloEstercaoAtual;
		this.anduloEstercaoMaximo = anduloEstercaoMaximo;
	}

	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	public void freiar() {
		System.out.println("Freiar");
	}
	
	public void buzinar() {
		System.out.println("Buzinar");
	}
	
	public void estercarVolante() {
		System.out.println("estercar volante");
	}
	
	public void calcularVelocidadeMedia() {
		System.out.println("Calculando velocidade média");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public double getAnguloEstercaoAtual() {
		return anguloEstercaoAtual;
	}

	public void setAnguloEstercaoAtual(double anguloEstercaoAtual) {
		this.anguloEstercaoAtual = anguloEstercaoAtual;
	}

	public double getAnduloEstercaoMaximo() {
		return anduloEstercaoMaximo;
	}

	public void setAnduloEstercaoMaximo(double anduloEstercaoMaximo) {
		this.anduloEstercaoMaximo = anduloEstercaoMaximo;
	}
	
}
