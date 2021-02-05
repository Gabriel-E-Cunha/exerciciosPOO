package exerciciosDia_04_02_2021.exercicio4.Outros;

public class Quadro {
	private String cor;
	private String tipo;
	private int numeroGizCanetao;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumeroGizCanetao() {
		return numeroGizCanetao;
	}
	public void setNumeroGizCanetao(int numeroGizCanetao) {
		this.numeroGizCanetao = numeroGizCanetao;
	}
	public Quadro(String cor, String tipo, int numeroGizCanetao) {
		super();
		this.cor = cor;
		this.tipo = tipo;
		this.numeroGizCanetao = numeroGizCanetao;
	}
	
	
	
}
