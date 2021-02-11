package ExercicioFiguraGeometrica;

public class Retangulo extends FiguraGeometrica {
	
	private double base;
	private double altura;
	
	public Retangulo(Cor cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return this.base * this.altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
	
}
