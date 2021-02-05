package exerciciosDia_04_02_2021.exercicio4.Salas;

public abstract class Sala {
	
	private int capacidadeFisica;
	private String identificacaoUnica;
	private String apelido;
	private String titulo;
	
	public Sala(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo) {
		super();
		this.capacidadeFisica = capacidadeFisica;
		this.identificacaoUnica = identificacaoUnica;
		this.apelido = apelido;
		this.titulo = titulo;
	}
	public int getCapacidadeFisica() {
		return capacidadeFisica;
	}
	public void setCapacidadeFisica(int capacidadeFisica) {
		this.capacidadeFisica = capacidadeFisica;
	}
	public String getIdentificacaoUnica() {
		return identificacaoUnica;
	}
	public void setIdentificacaoUnica(String identificacaoUnica) {
		this.identificacaoUnica = identificacaoUnica;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}
