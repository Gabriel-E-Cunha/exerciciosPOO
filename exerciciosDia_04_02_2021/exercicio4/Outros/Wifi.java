package exerciciosDia_04_02_2021.exercicio4.Outros;

public class Wifi {

	private double intesidadeSinal;
	private boolean isLigado;
	public void ligar() {
		System.out.println("ligando");
	}
	public Wifi(double intesidadeSinal, boolean isLigado) {
		super();
		this.intesidadeSinal = intesidadeSinal;
		this.isLigado = isLigado;
	}
	public double getIntesidadeSinal() {
		return intesidadeSinal;
	}
	public void setIntesidadeSinal(double intesidadeSinal) {
		this.intesidadeSinal = intesidadeSinal;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	
	
}
