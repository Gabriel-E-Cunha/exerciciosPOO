package exerciciosDia_04_02_2021.exercicio4.Salas.SalaAula;

import exerciciosDia_04_02_2021.exercicio4.Outros.Retroprojetor;
import exerciciosDia_04_02_2021.exercicio4.Outros.TV;
import exerciciosDia_04_02_2021.exercicio4.Outros.TelaProjecao;
import exerciciosDia_04_02_2021.exercicio4.Salas.Sala;

public abstract class SalaAula extends Sala {
	
	private String Professor;
	private int numeroAlunos;
	private Retroprojetor retroprojetor;
	private TelaProjecao telaProjecao;
	private TV tv;
	
	public SalaAula(int capacidadeFisica, String identificacaoUnica, String apelido, String titulo, String professor,
			int numeroAlunos, Retroprojetor retroprojetor, TelaProjecao telaProjecao, TV tv) {
		super(capacidadeFisica, identificacaoUnica, apelido, titulo);
		Professor = professor;
		this.numeroAlunos = numeroAlunos;
		this.retroprojetor = retroprojetor;
		this.telaProjecao = telaProjecao;
		this.tv = tv;
	}
	
	public void ensinar() {
		System.out.println("Ensinando");
	}
	
	public String getProfessor() {
		return Professor;
	}
	public void setProfessor(String professor) {
		Professor = professor;
	}
	public int getNumeroAlunos() {
		return numeroAlunos;
	}
	public void setNumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}
	public Retroprojetor getRetroprojetor() {
		return retroprojetor;
	}
	public void setRetroprojetor(Retroprojetor retroprojetor) {
		this.retroprojetor = retroprojetor;
	}
	public TelaProjecao getTelaProjecao() {
		return telaProjecao;
	}
	public void setTelaProjecao(TelaProjecao telaProjecao) {
		this.telaProjecao = telaProjecao;
	}
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	
	
}
