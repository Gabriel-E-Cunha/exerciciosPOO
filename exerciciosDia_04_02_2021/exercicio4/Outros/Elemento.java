package exerciciosDia_04_02_2021.exercicio4.Outros;

public class Elemento {

	private double pesoAtomico;
	private String nome;
	public double getPesoAtomico() {
		return pesoAtomico;
	}
	public void setPesoAtomico(double pesoAtomico) {
		this.pesoAtomico = pesoAtomico;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Elemento(double pesoAtomico, String nome) {
		super();
		this.pesoAtomico = pesoAtomico;
		this.nome = nome;
	}
	
	
	
}
