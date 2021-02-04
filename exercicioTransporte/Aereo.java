package exercicioTransporte;

public abstract class Aereo extends Transporte {
	
	private double coeficienteArrasto;
	private double altitudeMaxima;
	private double mobilidadeAerea;
	private int numeroRodas;
	private boolean pousaAgua;
	
	public Aereo(int capacidadePessoas, double capacidadeKilos, double coeficienteAerodinamico, double velocidadeMaxima,
			double velocidadeAtual, double aceleracaoSegundo, boolean isMotorizado, boolean isLigado, int numeroMotores,
			double coeficienteArrasto, double altitudeMaxima, double mobilidadeAerea, int numeroRodas,
			boolean pousaAgua) {
		super(capacidadePessoas, capacidadeKilos, coeficienteAerodinamico, velocidadeMaxima, velocidadeAtual,
				aceleracaoSegundo, isMotorizado, isLigado, numeroMotores);
		this.coeficienteArrasto = coeficienteArrasto;
		this.altitudeMaxima = altitudeMaxima;
		this.mobilidadeAerea = mobilidadeAerea;
		this.numeroRodas = numeroRodas;
		this.pousaAgua = pousaAgua;
	}
	
	
	private void pitch() {
		System.out.println("pitching");
	}
	private void row() {
		System.out.println("rowlling");
	}
	private void yaw() {
		System.out.println("yawllig");
	}
	private void decolar() {
		System.out.println("decolando");
	}
	private void pousar() {
		System.out.println("Pousando");
	}
	
	public double getCoeficienteArrasto() {
		return coeficienteArrasto;
	}
	public void setCoeficienteArrasto(double coeficienteArrasto) {
		this.coeficienteArrasto = coeficienteArrasto;
	}
	public double getAltitudeMaxima() {
		return altitudeMaxima;
	}
	public void setAltitudeMaxima(double altitudeMaxima) {
		this.altitudeMaxima = altitudeMaxima;
	}
	public double getMobilidadeAerea() {
		return mobilidadeAerea;
	}
	public void setMobilidadeAerea(double mobilidadeAerea) {
		this.mobilidadeAerea = mobilidadeAerea;
	}
	public int getNumeroRodas() {
		return numeroRodas;
	}
	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	public boolean isPousaAgua() {
		return pousaAgua;
	}
	public void setPousaAgua(boolean pousaAgua) {
		this.pousaAgua = pousaAgua;
	}
	
	
	
}
