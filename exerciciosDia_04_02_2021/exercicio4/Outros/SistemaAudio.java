package exerciciosDia_04_02_2021.exercicio4.Outros;

public class SistemaAudio {

	private double potenciaWatz;
	private boolean isLigado;
	public SistemaAudio(double potenciaWatz, boolean isLigado) {
		super();
		this.potenciaWatz = potenciaWatz;
		this.isLigado = isLigado;
	}
	public double getPotenciaWatz() {
		return potenciaWatz;
	}
	public void setPotenciaWatz(double potenciaWatz) {
		this.potenciaWatz = potenciaWatz;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	
	
}
