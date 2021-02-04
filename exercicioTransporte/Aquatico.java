package exercicioTransporte;

public abstract class Aquatico extends Transporte {
	
	private double coeficienteHidrodinamico;
	private int quantidadeHelices;
	private boolean hasVela;
	private boolean isSubmersivel;
	private double profundidadeMaxima;
	
	
	

	public Aquatico(int capacidadePessoas, double capacidadeKilos, double coeficienteAerodinamico,
			double velocidadeMaxima, double velocidadeAtual, double aceleracaoSegundo, boolean isMotorizado,
			boolean isLigado, int numeroMotores, double coeficienteHidrodinamico, int quantidadeHelices,
			boolean hasVela, boolean isSubmersivel, double profundidadeMaxima) {
		super(capacidadePessoas, capacidadeKilos, coeficienteAerodinamico, velocidadeMaxima, velocidadeAtual,
				aceleracaoSegundo, isMotorizado, isLigado, numeroMotores);
		this.coeficienteHidrodinamico = coeficienteHidrodinamico;
		this.quantidadeHelices = quantidadeHelices;
		this.hasVela = hasVela;
		this.isSubmersivel = isSubmersivel;
		this.profundidadeMaxima = profundidadeMaxima;
	}

	public void removerAguaInterna()
	{
		System.out.println("removendo água interna");
	}
	
	public void validarLicencaAquatica()
	{
		System.out.println("licenca aquatica valida");
	}
	
	public void virarEstibordo() {
		System.out.println("Virando estibordo");
	}
	
	public void virarBombordo()
	{
		System.out.println("Virando bombordo");
	}
	
	public void calcularPesoAquatico()
	{
		System.out.println("Peso aquático é: 100 toneladas");
	}
	
	public double getCoeficienteHidrodinamico() {
		return coeficienteHidrodinamico;
	}
	public void setCoeficienteHidrodinamico(double coeficienteHidrodinamico) {
		this.coeficienteHidrodinamico = coeficienteHidrodinamico;
	}
	public int getQuantidadeHelices() {
		return quantidadeHelices;
	}
	public void setQuantidadeHelices(int quantidadeHelices) {
		this.quantidadeHelices = quantidadeHelices;
	}
	public boolean isHasVela() {
		return hasVela;
	}
	public void setHasVela(boolean hasVela) {
		this.hasVela = hasVela;
	}
	public boolean isSubmersivel() {
		return isSubmersivel;
	}
	public void setSubmersivel(boolean isSubmersivel) {
		this.isSubmersivel = isSubmersivel;
	}
	public double getProfundidadeMaxima() {
		return profundidadeMaxima;
	}
	public void setProfundidadeMaxima(double profundidadeMaxima) {
		this.profundidadeMaxima = profundidadeMaxima;
	}
	
	
	
}
