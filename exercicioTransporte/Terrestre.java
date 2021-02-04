package exercicioTransporte;

public abstract class Terrestre extends Transporte {

	private boolean requerCarteira;
	private int numeroRodas;
	private String tipoPneu;
	private int numeroPortas;
	private String tipoMotor;

	public Terrestre(int capacidadePessoas, double capacidadeKilos, double coeficienteAerodinamico,
			double velocidadeMaxima, double velocidadeAtual, double aceleracaoSegundo, boolean isMotorizado,
			boolean isLigado, int numeroMotores, boolean requerCarteira, int numeroRodas, String tipoPneu,
			int numeroPortas, String tipoMotor) {
		super(capacidadePessoas, capacidadeKilos, coeficienteAerodinamico, velocidadeMaxima, velocidadeAtual,
				aceleracaoSegundo, isMotorizado, isLigado, numeroMotores);
		this.requerCarteira = requerCarteira;
		this.numeroRodas = numeroRodas;
		this.tipoPneu = tipoPneu;
		this.numeroPortas = numeroPortas;
		this.tipoMotor = tipoMotor;
	}

	public void virarEsquerda() {
		System.out.println("Virar esquerda");
	}
	
	public void virarDireita() {
		System.out.println("virar direita");
	}
	
	public void calibrarRodas() {
		System.out.println("Calibranco pneu");
	}
	
	public void trocarMarcha() {
		System.out.println("Trocando marcha tipo velozes e furiosos");
	}
	
	public void seguirVia() {
		System.out.println("Seguindo estrada como um tesla");
	}
	
	public boolean isRequerCarteira() {
		return requerCarteira;
	}
	public void setRequerCarteira(boolean requerCarteira) {
		this.requerCarteira = requerCarteira;
	}
	public int getNumeroRodas() {
		return numeroRodas;
	}
	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	public String getTipoPneu() {
		return tipoPneu;
	}
	public void setTipoPneu(String tipoPneu) {
		this.tipoPneu = tipoPneu;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	
	
}
