package exercicioClasses;

import java.sql.Date;

public class Conta {

	private String titularNome;
	private String titularCpf;
	private double limite;
	private double saldo;
	private double[] historicoTransferencias;
	private String tipo;
	private Date dataCriacao;
	private int diaVencimentoFatura;
	private double valorFatura;
	private double[] historicoFaturas;
	public Conta(String titularNome, String titularCpf, double limite, double saldo, double[] historicoTransferencias,
			String tipo, Date dataCriacao, int diaVencimentoFatura, double valorFatura, double[] historicoFaturas) {
		super();
		this.titularNome = titularNome;
		this.titularCpf = titularCpf;
		this.limite = limite;
		this.saldo = saldo;
		this.historicoTransferencias = historicoTransferencias;
		this.tipo = tipo;
		this.dataCriacao = dataCriacao;
		this.diaVencimentoFatura = diaVencimentoFatura;
		this.valorFatura = valorFatura;
		this.historicoFaturas = historicoFaturas;
	}
	
	public void sacar() {
		System.out.println("Sacando dinheiro");
	}
	
	public void transferir() {
		System.out.println("transferir dinheiro");
	}
	
	public void depositar() {
		System.out.println("depositar dinheiro");
	}
	
	public void finalizar() {
		System.out.println("finalizar conta");
	}
	
	public void requerirAumentoLimite() {
		System.out.println("requerir aumento");
	}
	
	public String getTitularNome() {
		return titularNome;
	}
	public void setTitularNome(String titularNome) {
		this.titularNome = titularNome;
	}
	public String getTitularCpf() {
		return titularCpf;
	}
	public void setTitularCpf(String titularCpf) {
		this.titularCpf = titularCpf;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double[] getHistoricoTransferencias() {
		return historicoTransferencias;
	}
	public void setHistoricoTransferencias(double[] historicoTransferencias) {
		this.historicoTransferencias = historicoTransferencias;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public int getDiaVencimentoFatura() {
		return diaVencimentoFatura;
	}
	public void setDiaVencimentoFatura(int diaVencimentoFatura) {
		this.diaVencimentoFatura = diaVencimentoFatura;
	}
	public double getValorFatura() {
		return valorFatura;
	}
	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}
	public double[] getHistoricoFaturas() {
		return historicoFaturas;
	}
	public void setHistoricoFaturas(double[] historicoFaturas) {
		this.historicoFaturas = historicoFaturas;
	}
	
	
	
}
