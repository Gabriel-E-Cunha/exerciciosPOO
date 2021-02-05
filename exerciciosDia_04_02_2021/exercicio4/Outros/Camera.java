package exerciciosDia_04_02_2021.exercicio4.Outros;

public class Camera {

	private double megaPixels;
	private String modelo;
	private String marca;
	public double getMegaPixels() {
		return megaPixels;
	}
	public void setMegaPixels(double megaPixels) {
		this.megaPixels = megaPixels;
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
	public Camera(double megaPixels, String modelo, String marca) {
		super();
		this.megaPixels = megaPixels;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	
	
}
