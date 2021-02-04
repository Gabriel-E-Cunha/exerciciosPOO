package exercicioClasses;

import java.security.Timestamp;
import java.sql.Date;

public class Animal {

	private String nome;
	private Date dataNascimento;
	private String reino;
	private double peso;
	private double comprimento;
	private double altura;
	private String tipoNutricao;
	private double velocidadeMaxima;
	private double velocidadeAtual;
	private double quilosAlimentoDia;
	private Timestamp tempoMaturacao;
	
	public Animal(String nome, Date dataNascimento, String reino, double peso, double comprimento, double altura,
			String tipoNutricao, double velocidadeMaxima, double velocidadeAtual, double quilosAlimentoDia,
			Timestamp tempoMaturacao) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.reino = reino;
		this.peso = peso;
		this.comprimento = comprimento;
		this.altura = altura;
		this.tipoNutricao = tipoNutricao;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = velocidadeAtual;
		this.quilosAlimentoDia = quilosAlimentoDia;
		this.tempoMaturacao = tempoMaturacao;
	}

	public void andar() {
		System.out.println("Andando");
	}
	
	public void comunicar() {
		System.out.println("Comunicar");
	}
	
	public void reproduzir() {
		System.out.println("Reproducao");
	}
	
	public void comer() {
		System.out.println("Comendo");
	}
	
	public void dormir() {
		System.out.println("Dormindo");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getTipoNutricao() {
		return tipoNutricao;
	}

	public void setTipoNutricao(String tipoNutricao) {
		this.tipoNutricao = tipoNutricao;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getQuilosAlimentoDia() {
		return quilosAlimentoDia;
	}

	public void setQuilosAlimentoDia(double quilosAlimentoDia) {
		this.quilosAlimentoDia = quilosAlimentoDia;
	}

	public Timestamp getTempoMaturacao() {
		return tempoMaturacao;
	}

	public void setTempoMaturacao(Timestamp tempoMaturacao) {
		this.tempoMaturacao = tempoMaturacao;
	}
	
	
	
}
