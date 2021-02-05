package exerciciosDia_04_02_2021.exercicio4.Salas.Escritorio;

import exercicioClasses.Pessoa;
import exerciciosDia_04_02_2021.exercicio4.Salas.Sala;

public class Escritorio extends Sala {

	private Pessoa dono;
	private String donoProfissao;
	private boolean temArCondicionado;
	
	public void trabalhar() {
		System.out.println("Dono está trabalhando");
	}
	
	public Pessoa getDono() {
		return dono;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	public String getDonoProfissao() {
		return donoProfissao;
	}
	public void setDonoProfissao(String donoProfissao) {
		this.donoProfissao = donoProfissao;
	}
	public boolean isTemArCondicionado() {
		return temArCondicionado;
	}
	public void setTemArCondicionado(boolean temArCondicionado) {
		this.temArCondicionado = temArCondicionado;
	}
	public Escritorio(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo, Pessoa dono,
			String donoProfissao, boolean temArCondicionado) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo);
		this.dono = dono;
		this.donoProfissao = donoProfissao;
		this.temArCondicionado = temArCondicionado;
	}
	
	
	
	
}
