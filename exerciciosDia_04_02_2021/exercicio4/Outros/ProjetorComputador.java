package exerciciosDia_04_02_2021.exercicio4.Outros;

public class ProjetorComputador {

	private ComputadorRede computadorAcoplado;
	private boolean isLigado;
	public ComputadorRede getComputadorAcoplado() {
		return computadorAcoplado;
	}
	public void setComputadorAcoplado(ComputadorRede computadorAcoplado) {
		this.computadorAcoplado = computadorAcoplado;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public ProjetorComputador(ComputadorRede computadorAcoplado, boolean isLigado) {
		super();
		this.computadorAcoplado = computadorAcoplado;
		this.isLigado = isLigado;
	}
	
	
	
}
