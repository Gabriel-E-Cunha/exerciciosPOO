package exercicioTransporte;

public class Automovel extends Terrestre {
	
	private String modelo;
	private String marca;
	private String placa;
	private String cor;
	private int numeroPortas;
	
	public Automovel(int capacidadePessoas, double capacidadeKilos, double coeficienteAerodinamico,
			double velocidadeMaxima, double velocidadeAtual, double aceleracaoSegundo, boolean isMotorizado,
			boolean isLigado, int numeroMotores, boolean requerCarteira, int numeroRodas, String tipoPneu,
			int numeroPortas, String tipoMotor, String modelo, String marca, String placa, String cor,
			int numeroPortas2) {
		super(capacidadePessoas, capacidadeKilos, coeficienteAerodinamico, velocidadeMaxima, velocidadeAtual,
				aceleracaoSegundo, isMotorizado, isLigado, numeroMotores, requerCarteira, numeroRodas, tipoPneu,
				numeroPortas, tipoMotor);
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.cor = cor;
		numeroPortas = numeroPortas2;
	}

	public void fazerDrift() {
		System.out.println("Derrapando");
	}
	
	public void abrirPorta() {
		System.out.println("Abrindo porta");
	}
	
	public void abrirCapo() {
		System.out.println("Abrindo capô");
	}
	
	public void abrirPortaMalas() {
		System.out.println("Abrindo porta malas");
	}
	
	public void ligarFarol() {
		System.out.println("Ligando farol");
	}
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
	
	
}
