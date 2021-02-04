package exercicioTransporte;

public class Barco extends Aquatico {

	private int numeroVelas;
	private String nome;
	private String nomeCapitao;
	private String tipo;
	private int numeroMotores;
	
	
	
	public Barco(int capacidadePessoas, double capacidadeKilos, double coeficienteAerodinamico, double velocidadeMaxima,
			double velocidadeAtual, double aceleracaoSegundo, boolean isMotorizado, boolean isLigado, int numeroMotores,
			double coeficienteHidrodinamico, int quantidadeHelices, boolean hasVela, boolean isSubmersivel,
			double profundidadeMaxima, int numeroVelas, String nome, String nomeCapitao, String tipo,
			int numeroMotores2) {
		super(capacidadePessoas, capacidadeKilos, coeficienteAerodinamico, velocidadeMaxima, velocidadeAtual,
				aceleracaoSegundo, isMotorizado, isLigado, numeroMotores, coeficienteHidrodinamico, quantidadeHelices,
				hasVela, isSubmersivel, profundidadeMaxima);
		this.numeroVelas = numeroVelas;
		this.nome = nome;
		this.nomeCapitao = nomeCapitao;
		this.tipo = tipo;
		numeroMotores = numeroMotores2;
	}
	public void icarVelas() {
		System.out.println("Içando velas");
	}
	public void recolherVelas() {
		System.out.println("recolhendo velas");
	}
	public void observarMastro() {
		System.out.println("TERRA A VISTA!!!");
	}
	public void ancorar() {
		System.out.println("Soltando âncora");
	}
	public void desancorar() {
		System.out.println("desancorando");
	}
	
	public int getNumeroVelas() {
		return numeroVelas;
	}
	public void setNumeroVelas(int numeroVelas) {
		this.numeroVelas = numeroVelas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeCapitao() {
		return nomeCapitao;
	}
	public void setNomeCapitao(String nomeCapitao) {
		this.nomeCapitao = nomeCapitao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumeroMotores() {
		return numeroMotores;
	}
	public void setNumeroMotores(int numeroMotores) {
		this.numeroMotores = numeroMotores;
	}
	
	
	
}
