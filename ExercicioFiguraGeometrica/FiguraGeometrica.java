package ExercicioFiguraGeometrica;

public abstract class FiguraGeometrica implements IFiguraGeometrica {

	private Cor cor;

	public FiguraGeometrica(Cor cor) {
		super();
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
	
}
