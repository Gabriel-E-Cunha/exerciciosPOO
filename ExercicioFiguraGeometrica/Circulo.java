package ExercicioFiguraGeometrica;

public class Circulo extends FiguraGeometrica {

	private double raio;

	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public double calcularArea() {
		return Math.PI * (this.raio * this.raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	
}
