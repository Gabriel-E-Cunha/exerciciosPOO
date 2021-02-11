package ExercicioFiguraGeometrica;

public class test {

	public static void main(String[] args) {
		
		FiguraGeometrica triangulo = new Triangulo(Cor.AZUL, 10, 5);
		FiguraGeometrica quadrado = new Quadrado(Cor.AZUL, 5);
		FiguraGeometrica circulo = new Circulo(Cor.AZUL, 5);
		FiguraGeometrica retangulo = new Retangulo(Cor.AZUL, 7, 10);
		
		System.out.println(triangulo.calcularArea());
		System.out.println(quadrado.calcularArea());
		System.out.println(circulo.calcularArea());
		System.out.println(retangulo.calcularArea());
	}

}
