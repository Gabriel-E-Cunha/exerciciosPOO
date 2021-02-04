package exercicioTransporte;

public abstract class Transporte {
	private int capacidadePessoas;
	private double capacidadeKilos;
	private double coeficienteAerodinamico;
	private double velocidadeMaxima;
	private double velocidadeAtual;
	private double aceleracaoSegundo;
	private boolean isMotorizado;
	private boolean isLigado;
	private int numeroMotores;
	
	
	
	

	public Transporte(int capacidadePessoas, double capacidadeKilos, double coeficienteAerodinamico,
			double velocidadeMaxima, double velocidadeAtual, double aceleracaoSegundo, boolean isMotorizado,
			boolean isLigado, int numeroMotores) {
		super();
		this.capacidadePessoas = capacidadePessoas;
		this.capacidadeKilos = capacidadeKilos;
		this.coeficienteAerodinamico = coeficienteAerodinamico;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = velocidadeAtual;
		this.aceleracaoSegundo = aceleracaoSegundo;
		this.isMotorizado = isMotorizado;
		this.isLigado = isLigado;
		this.numeroMotores = numeroMotores;
	}

	public void ligar() {
		System.out.println("ligando");
	}
	
	public void acelerar() {
		System.out.println("acelerando");
	}
	
	public void desacelerar() {
		System.out.println("desacelerando");
	}
	
	public void calcularRotaGPS() {
		System.out.println("Você chegou ao seu destino");
	}
	
	public void abastecer() {
		System.out.println("abastecendo");
	}
	
	public void fazerManutencao() {
		System.out.println("Fazendo manutenção");
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	public double getCapacidadeKilos() {
		return capacidadeKilos;
	}

	public void setCapacidadeKilos(double capacidadeKilos) {
		this.capacidadeKilos = capacidadeKilos;
	}

	public double getCoeficienteAerodinamico() {
		return coeficienteAerodinamico;
	}

	public void setCoeficienteAerodinamico(double coeficienteAerodinamico) {
		this.coeficienteAerodinamico = coeficienteAerodinamico;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getAceleracaoSegundo() {
		return aceleracaoSegundo;
	}

	public void setAceleracaoSegundo(double aceleracaoSegundo) {
		this.aceleracaoSegundo = aceleracaoSegundo;
	}

	public boolean isMotorizado() {
		return isMotorizado;
	}

	public void setMotorizado(boolean isMotorizado) {
		this.isMotorizado = isMotorizado;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getNumeroMotores() {
		return numeroMotores;
	}

	public void setNumeroMotores(int numeroMotores) {
		this.numeroMotores = numeroMotores;
	}
	
	
	
	
	
	
}
