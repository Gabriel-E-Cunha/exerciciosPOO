package ExercicioFiguraGeometrica;

public class Quadrado extends Retangulo {

	public Quadrado(Cor cor, double lado) {
		super(cor, lado, lado);
	}
	
	
	public void setLado(double lado) {
		super.setBase(lado);
		super.setAltura(lado);
	}
	
	@Override
	public void setBase(double lado) {
		this.setLado(lado);
	}
	
	@Override
	public void setAltura(double lado) {
		this.setLado(lado);
	}
	
}
