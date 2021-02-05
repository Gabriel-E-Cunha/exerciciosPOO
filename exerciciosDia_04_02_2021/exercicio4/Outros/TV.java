package exerciciosDia_04_02_2021.exercicio4.Outros;

public class TV {

	private boolean isACabo;
	private double resolucao;
	public boolean isACabo() {
		return isACabo;
	}
	public void setACabo(boolean isACabo) {
		this.isACabo = isACabo;
	}
	public double getResolucao() {
		return resolucao;
	}
	public void setResolucao(double resolucao) {
		this.resolucao = resolucao;
	}
	public TV(boolean isACabo, double resolucao) {
		super();
		this.isACabo = isACabo;
		this.resolucao = resolucao;
	}
	
	
}
